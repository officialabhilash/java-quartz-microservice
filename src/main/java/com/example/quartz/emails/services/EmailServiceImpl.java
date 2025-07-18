package com.example.quartz.emails.services;

import com.example.quartz.emails.grpc.generated.*;
import com.example.quartz.jobs.SampleJob;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.ZonedDateTime;
import java.util.UUID;

@GrpcService
public class EmailServiceImpl extends EmailServiceGrpc.EmailServiceImplBase {

    @Autowired
    private Scheduler scheduler; // This will help in scheduling jobs using trigger for the job and ZonedDateTime
    
    private static final Logger logger = LoggerFactory.getLogger(EmailServiceImpl.class);
    
    @Override
    public void sendNow(EmailRequest request, StreamObserver<JobResponse> responseObserver) {
        logger.info("Sending email now to: {}", request.getEmailAddress());
        JobResponse response;
        // Create Job Data here

        JobDataMap jobDataMap = new JobDataMap();
        jobDataMap.put("email", request.getEmailAddress());
        jobDataMap.put("subject", request.getSub());
        jobDataMap.put("body", request.getBody());


        // Create job details here, abstraction comes later on
        JobDetail jobDetail = JobBuilder
                .newJob(SampleJob.class)
                .withIdentity(UUID.randomUUID().toString(), "email-group")
                .withDescription("Email being sent now")
                .usingJobData(jobDataMap)
                .build();

        // Create the trigger for the job.
        Trigger trigger = SampleJob.buildJobTriggerForNow(
                jobDetail,
                ZonedDateTime.now(),
                "email-jobs",
                String.format("Sending email to %s at %s", jobDataMap.get("email"), ZonedDateTime.now())
        );

        // Try scheduling the job for the job detail and the trigger.
        try {
            scheduler.scheduleJob(jobDetail, trigger);
            response = JobResponse.newBuilder()
                    .setStatus(true)
                    .setMessage(String.format("Email sent successfully to %s", request.getEmailAddress()))
                    .build();
        } catch (SchedulerException e){
            response = JobResponse.newBuilder()
                    .setStatus(false)
                    .setMessage(String.format("Error occurred while sending email to: %s", request.getEmailAddress()))
                    .build();
        }

        // The following is used for sending grpc response
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    
    @Override
    public void sendLater(EmailLaterRequest request, StreamObserver<JobResponse> responseObserver) {
        logger.info("Scheduling email for later to: {} with cron: {}", 
                   request.getEmailAddress(), request.getCronExpression());

        JobDataMap jobDataMap = new JobDataMap();
        jobDataMap.put("email", request.getEmailAddress());
        jobDataMap.put("subject", request.getSub());
        jobDataMap.put("body", request.getBody());
        JobDetail jobDetail = JobBuilder
                .newJob()
                .withIdentity(UUID.randomUUID().toString(), "email-jobs")
                .withDescription("Send Email Later")
                .usingJobData(jobDataMap)
                .storeDurably()
                .build();
        
        JobResponse response = JobResponse.newBuilder()
                .setStatus(true)
                .setMessage("Email scheduled successfully for " + request.getEmailAddress())
                .build();
        
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
} 