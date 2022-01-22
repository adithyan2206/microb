package com.ar.microb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ={"com.ar.microb"})
public class MicrobApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrobApplication.class, args);
	}

}
