package com.theKiranAkademy.hms.helper;

import java.time.LocalDateTime;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Helper {
	@Before("execution (* com.theKiranAkademy.hms.controller.NursingController.getAllNursingStaff())")
	public void createAthorization() {
		System.out.println("User is Autorizetion before started " + LocalDateTime.now());
	}
	@After("execution (* com.theKiranAkademy.hms.controller.NursingController.getAllNursingStaff())")
	public void createAthorization2() {
		System.out.println("User is Autorizetion after metod completion");
	}

}
