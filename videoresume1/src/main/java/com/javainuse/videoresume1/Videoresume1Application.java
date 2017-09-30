package com.javainuse.videoresume1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.javainuse.controllers"})
public class Videoresume1Application {

	public static void main(String[] args) {
		SpringApplication.run(Videoresume1Application.class, args);
	}
}
