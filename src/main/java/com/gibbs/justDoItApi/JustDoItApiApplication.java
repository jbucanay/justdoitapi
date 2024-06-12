package com.gibbs.justDoItApi;

import com.gibbs.justDoItApi.repo.TaskRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JustDoItApiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JustDoItApiApplication.class, args);

//		TaskRepo repo = context.getBean(TaskRepo.class);

//		System.out.println(repo.findAll());


	}

}
