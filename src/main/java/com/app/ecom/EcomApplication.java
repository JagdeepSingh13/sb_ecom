package com.app.ecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcomApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomApplication.class, args);
	}

}
// ./mvnw spring-boot:build-image "-Dspring-boot.build-image.imageName=jsingh3113/ecom-application"
// docker login
// docker push jsingh3113/ecom-application
// docker images, docker ps
// docker run (-d) -p 8080:8080 jsingh3113/ecom-application
// -d does not block that terminal, in detached mode
// docker stop <container-id>