package com.practice.docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	@GetMapping("/msg")
	public String getMessage() {
		return "dockerize the application in jar without database";
	}

}
