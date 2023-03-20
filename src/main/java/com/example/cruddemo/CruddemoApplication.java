package com.example.cruddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;

@SpringBootApplication(scanBasePackages ={"com.example.cruddemo"})
//(scanBasePackages = {"com.example.cruddemo","com.example.cruddemo.dao"})

@EnableJpaRepositories
public class CruddemoApplication  {
	//@Autowired
	//private ApplicationContext appContext;
	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}


	//to show beans
	 /*@Bean
	public CommandLineRunner run(ApplicationContext appContext) {
		return args -> {

			String[] beans = appContext.getBeanDefinitionNames();
			Arrays.stream(beans).sorted().forEach(System.out::println);

		};
	}*/

}
