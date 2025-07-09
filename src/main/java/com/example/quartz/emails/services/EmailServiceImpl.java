package com.example.quartz.emails.services;

import com.example.quartz.emails.grpc.generated.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GrpcService
public class EmailServiceImpl extends EmailServiceGrpc.EmailServiceImplBase {
    
    private static final Logger logger = LoggerFactory.getLogger(EmailServiceImpl.class);
    
    @Override
    public void sendNow(EmailRequest request, StreamObserver<JobResponse> responseObserver) {
        logger.info("Sending email now to: {}", request.getEmailAddress());
        
        JobResponse response = JobResponse.newBuilder()
                .setStatus(true)
                .setMessage(String.format("Email sent successfully to %s Body: %s", request.getEmailAddress(), request.getBody()))
                .build();
        
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    
    @Override
    public void sendLater(EmailLaterRequest request, StreamObserver<JobResponse> responseObserver) {
        logger.info("Scheduling email for later to: {} with cron: {}", 
                   request.getEmailAddress(), request.getCronExpression());
        
        JobResponse response = JobResponse.newBuilder()
                .setStatus(true)
                .setMessage("Email scheduled successfully for " + request.getEmailAddress())
                .build();
        
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
} 