package com.webtech.webtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@EnableWebMvc
public class WebtechApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebtechApplication.class, args);
	}

}