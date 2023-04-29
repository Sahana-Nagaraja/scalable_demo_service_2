package com.bits.wilp.demo_service_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoService2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoService2Application.class, args);
	}

}
