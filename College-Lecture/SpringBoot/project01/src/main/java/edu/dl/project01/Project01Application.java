package edu.dl.project01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project01Application {

	public static void main(String[] args) {
		SpringApplication.run(Project01Application.class, args);

		Hello hello = new Hello();
		hello.setMsg("Hello Alan?");
		String msg = hello.getMsg();
		System.out.println(msg);
	}

}
