package com.josemeurer.sendingemails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.SystemEnvironmentPropertySource;

import java.util.Arrays;
import java.util.stream.Collectors;

@SpringBootApplication
public class SendingEmailsApplication {

	@Autowired
	private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(SendingEmailsApplication.class, args);
	}
}
