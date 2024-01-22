package com.mms.starterMongoDB;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	private final UserRepository userRepository;
	public UserController( UserRepository userRepository){
		this.userRepository = userRepository;
	}

	@GetMapping("/hola")
	public String saludar() {

		System.out.println("XXXX");

		userRepository.findAll().stream()
				.map(user -> "id: "+user.getId() + " name: " + user.getName() + " cod: " + user.getCod() )
				.forEach(System.out::println);

		return "hola";
	}

}