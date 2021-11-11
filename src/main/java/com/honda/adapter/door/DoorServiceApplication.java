package com.honda.adapter.door;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.honda.adapter.door.model.BasicSynchronousErrorModel;


@SpringBootApplication
public class DoorServiceApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(DoorServiceApplication.class, args);
	}

}
