package com.example.restTest;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring.xml")
public class RestTestApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(RestTestApplication.class, args);
	
		System.out.println(context);
	}

	
		@Bean
		public CommandLineRunner commandRunner(ApplicationContext ctx){
			return (args) -> {
					Arrays.stream(ctx.getBeanDefinitionNames())
						.sorted()
						.forEach(beanName->System.out.println(beanName));
				};

			}

	
	
}
