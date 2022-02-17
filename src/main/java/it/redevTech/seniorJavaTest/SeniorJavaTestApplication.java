package it.redevTech.seniorJavaTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"it.redevTech"})
public class SeniorJavaTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeniorJavaTestApplication.class, args);
	}

}
