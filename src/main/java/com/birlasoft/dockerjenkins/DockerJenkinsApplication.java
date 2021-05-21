package com.birlasoft.dockerjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerJenkinsApplication {
	@GetMapping("/message")
	public String getMessage(){
		return "This is Docker Jenkins Integration";
	}


	public static void main(String[] args) {
		SpringApplication.run(DockerJenkinsApplication.class, args);
	}

}
