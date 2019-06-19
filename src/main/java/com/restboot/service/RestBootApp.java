package com.restboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestBootApp implements CommandLineRunner {
	@Autowired
	private BankService bankService;

	public static void main(String[] args) throws Exception {

		SpringApplication app = new SpringApplication(RestBootApp.class);
		app.run(args);

		// SpringApplication.run(SpringBootConsoleApplication.class, args);
	}

	public void run(String... args) throws Exception {
		// bankService.getBranchLocation();
		// bankService.getBranchLocationByCity("LIVERPOOL");
		// exit(0);
	}
}