package com.tka.rtspp.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RTSPPApplication {

	public static void main(String[] args) {
		SpringApplication.run(RTSPPApplication.class, args);
		System.err.println("app started...");
	}
}
