package com.example.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication(exclude = {net.devh.boot.grpc.server.autoconfigure.GrpcServerSecurityAutoConfiguration.class})
//@SpringBootApplication
public class QuartzApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(QuartzApplication.class);

		// Hardcode the external config location
		Map<String, Object> defaultProps = new HashMap<>();
		defaultProps.put("spring.config.location", "file:/home/abhilash/Desktop/learning/learn-java/microservices/quartz-microservice/src/main/resources/application.properties");
		app.setDefaultProperties(defaultProps);
		System.out.println(app.getSources());
		app.run(args);
	}

}
