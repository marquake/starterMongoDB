package com.mms.starterMongoDB;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

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

	@GetMapping("/altaUser")
	public String altaUser(){

		User user = new User();
		user.setCod(UUID.randomUUID().toString());
		user.setName(UUID.randomUUID().toString());
		user.setEdad(18);

		User userSaved = userRepository.save(user);

		System.out.println("userSaved: " + userSaved.toString());
		return userSaved.toString();
	}

	@GetMapping("/modificarUser")
	public String modificarUser(){

		User userSaved = null;
		//User userFound = userRepository.findById("22").orElse(null);
		User userFound = userRepository.findByCod("2");

		if (userFound != null){
			userFound.setName( userFound.getName().concat("_modified"));

			userSaved = userRepository.save(userFound);
			System.out.println("userSaved: " + userSaved.toString());

			return userSaved.toString();
		}else{
			return "no se ha econtrado al usuario";
		}

	}


}