package com.example.quartz.jobs;

import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;
import java.util.Date;

@Component
public class SampleJob implements Job {

    private static final Logger logger = LoggerFactory.getLogger(SampleJob.class);

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        logger.info("\n\n\nSample Job executed at: {}", System.currentTimeMillis());
        for (long i=0; i<30_000_000_000L; i++){
            i = i - 1 + 1;
        }
        logger.info("\n\n\nSample Job completed at: {}", System.currentTimeMillis());
    }

    public static Trigger buildJobTriggerForNow(JobDetail jobDetail, ZonedDateTime zonedDateTime, String group, String description) {
        return TriggerBuilder
                .newTrigger()
                .forJob(jobDetail)
                .withIdentity(jobDetail.getKey().getName(), group)
                .withDescription(description)
                .startAt(Date.from(zonedDateTime.toInstant()))
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withMisfireHandlingInstructionFireNow())
                .build();
    }

    public static Trigger buildJobTriggerForLater(JobDetail jobDetail, ZonedDateTime zonedDateTime, String group) {
        return TriggerBuilder.newTrigger()
                .forJob(jobDetail)
                .withIdentity(jobDetail.getKey().getName(), group)
                .startAt(Date.from(zonedDateTime.toInstant()))
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withMisfireHandlingInstructionFireNow())
                .build();
    }
}