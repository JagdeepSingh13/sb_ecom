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

// -Duser.timezone=Asia/Kolkata

// docker run -d --name db -r POSTGRES_PASSWORD=password postgres:14
// docker run -d --name pgadmin -e PGADMIN_DEFAULT_EMAIL=user@domain.com -e PGADMIN_DEFAULT_PASSWORD=password dpage/pgadmin4
// to access db from pgadmin -> docker exec -it pgadmin ping db (but, gives bad address db)
// docker network create my-network (docker network prune to delete network)
// docker rm -f db pgadmin (we want to create these in our network)
// docker run -d --name db --network my-network -e POSTGRES_PASSWORD=password postgres:14
// docker run -d --name pgadmin --network my-network -e PGADMIN_DEFAULT_EMAIL=user@domain.com -e PGADMIN_DEFAULT_PASSWORD=password dpage/pgadmin4
// docker exec -it pgadmin ping db (now this works)


// docker network create postgres
// docker run -d --name postgres_container -e POSTGRES_USER=jsingh -e POSTGRES_PASSWORD=jsingh -e PGDATA=/data/postgres -v postgres:/data/postgres -p 5432:5432 --network postgres --restart unless-stopped postgres:14
// docker run -d --name pgadmin_container -e PGADMIN_DEFAULT_EMAIL=pgadmin4@pgadmin.org -e PGADMIN_DEFAULT_PASSWORD=admin -e PGADMIN_CONFIG_SERVER=False -v pgadmin:/var/lib/pgadmin -p 5050:80 --network postgres --restart unless-stopped dpage/pgadmin4

// or use docker-compose.yml
// run -> docker compose up (-d)

