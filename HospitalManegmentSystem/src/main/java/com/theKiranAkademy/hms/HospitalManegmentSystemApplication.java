package com.theKiranAkademy.hms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@ComponentScan("com")
@EnableAspectJAutoProxy
public class HospitalManegmentSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalManegmentSystemApplication.class, args);
		System.out.println("Hello");
	}

}
