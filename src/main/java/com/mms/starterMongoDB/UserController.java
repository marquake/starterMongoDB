package com.mms.starterMongoDB;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/hola")
	public String saludar() {
		System.out.println("XXXX");
		return "hola";
	}

}
