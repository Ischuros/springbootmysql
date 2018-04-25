package com.ischuros.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/demo")
public class MainController {

	private final UserRepository userRepository;

	@Autowired
	public MainController(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@PostMapping(path="/add")
	public User addNewUser(@RequestBody User user) {
		return userRepository.save(user);
	}

	@GetMapping(path = "/all")
	public Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}
}
