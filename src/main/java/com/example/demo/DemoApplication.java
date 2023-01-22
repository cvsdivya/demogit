package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//https://start.spring.io/
//https://www.techgeeknext.com/spring-boot/spring-boot-tutorial-hello-world-rest-example
//https://www.bezkoder.com/spring-boot-jpa-crud-rest-api/

//http://localhost:8080/api/tutorials

//http://localhost:8080/dogapi/createdog

//Test one


@SpringBootApplication
@EnableJpaAuditing
public class DemoApplication {
	
		public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
