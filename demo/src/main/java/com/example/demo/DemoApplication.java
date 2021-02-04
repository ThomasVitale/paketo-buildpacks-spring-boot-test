package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RestController
	static class RuntimeController {

		@GetMapping("/")
		public List<String> getRuntime() {
			Runtime runtime = Runtime.getRuntime();
			return List.of(
					"Available processors: " + runtime.availableProcessors(),
					"Total memory: " + runtime.totalMemory(),
					"Max memory: " + runtime.maxMemory(),
					"Free memory: " + runtime.freeMemory()
			);
		}
	}
}
