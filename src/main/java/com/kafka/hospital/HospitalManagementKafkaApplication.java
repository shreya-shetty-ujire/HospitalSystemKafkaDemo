package com.kafka.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class HospitalManagementKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalManagementKafkaApplication.class, args);
	}

}
