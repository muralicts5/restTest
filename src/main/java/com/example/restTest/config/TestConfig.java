package com.example.restTest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.restTest.controller.TestController;

//@Configuration
public class TestConfig {

	  //@Bean
	public TestController createTestController() {
		TestController controller =new TestController();
		return controller;
	}
	
	
}
