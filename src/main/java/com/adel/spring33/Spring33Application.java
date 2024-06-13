package com.adel.spring33;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Spring33Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Spring33Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Spring 3.3 loaded");
	}
}
