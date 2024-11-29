package com.devsuperior.send_book_email.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.devsuperior.send_book_email.domain.UserBookLoan;

@Configuration
public class SendEmailRequestReturnWriterConfig {
	
	@Bean
	ItemWriter<UserBookLoan> sendEmailRequestReturnWriter(){
		return items -> items.forEach(System.out::println);
	}

}
