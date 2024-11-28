package com.devsuperior.send_book_email.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SendBookLoanNotificationJobConfig {
	
	@Bean 
	public Job sendBookLoanNotificationJob(Step sendEmailUserStep,JobRepository jobRepositiry) {
		return new JobBuilder("sendBookLoanNotificationJob", jobRepositiry)
				.start(sendEmailUserStep)
				.incrementer(new RunIdIncrementer())
				.build();
	}

}
