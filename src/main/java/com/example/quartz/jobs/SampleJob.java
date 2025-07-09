package com.example.quartz.jobs;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SampleJob implements Job {
    
    private static final Logger logger = LoggerFactory.getLogger(SampleJob.class);
    
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        logger.info("Sample Job executed at: {}", System.currentTimeMillis());
    }
} 