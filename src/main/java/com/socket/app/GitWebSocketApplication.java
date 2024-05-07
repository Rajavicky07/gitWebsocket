package com.socket.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.socket")
public class GitWebSocketApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitWebSocketApplication.class, args);
	}
}