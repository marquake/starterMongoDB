package com.mms.starterMongoDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class StarterMongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarterMongoDbApplication.class, args);
	}

}
