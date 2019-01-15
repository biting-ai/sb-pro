package com.jerryring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
public class SbProApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbProApplication.class, args);
		DataSource dataSource = context.getBean(DataSource.class);
		System.out.println(dataSource.getClass());

//		SpringApplication.run(SbProApplication.class, args);
	}
}
