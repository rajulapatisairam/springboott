package spring.boot.practice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AOPController {

	@Before("execution(* spring.boot.practice.controller.SpringController.*(..))")
	public void before(JoinPoint joinPoint){
		System.out.println(" In before Point Cut");
		
	}
	
}
