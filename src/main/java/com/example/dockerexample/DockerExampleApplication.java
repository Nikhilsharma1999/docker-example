package com.example.dockerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerExampleApplication {

	public static void main(String[] args) {
		System.out.println("Hello Docker");
		int i=0;
		for (i=0;i< 10;i++){
			System.out.println("i : "+ i);
			i++;
		}
		/*SpringApplication.run(DockerExampleApplication.class, args);*/
	}

}
