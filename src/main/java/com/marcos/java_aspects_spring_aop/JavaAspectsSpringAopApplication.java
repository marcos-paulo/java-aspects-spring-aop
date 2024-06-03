package com.marcos.java_aspects_spring_aop;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.marcos.java_aspects_spring_aop.dummy.DummyService;
import com.marcos.java_aspects_spring_aop.hello.HelloService;

@SpringBootApplication
public class JavaAspectsSpringAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaAspectsSpringAopApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(HelloService helloService, DummyService dummyService) {
		return args -> {
			System.out.println("Hello from JavaAspectsSpringAopApplication");
			helloService.hello();
			dummyService.dummy();
		};
	}

}
