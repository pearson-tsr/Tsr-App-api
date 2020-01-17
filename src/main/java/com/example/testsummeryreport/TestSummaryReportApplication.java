package com.example.testsummeryreport;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class TestSummaryReportApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSummaryReportApplication.class, args);
	}
	
}
