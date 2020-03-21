package com.cts.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.demo.dao.UserRepository;
import com.cts.demo.pojos.User;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	@RequestMapping("/getAllUser")
 public Iterable<User> getAllUser()
 {
		return userRepository.findAll();
 }
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user)
	{
		System.out.println(user);
		userRepository.save(user);
		return user;
	}
	
	@PutMapping("/updateUser/{username}")
	public User updateUser(@RequestBody User user,@PathVariable("username") String username) 
	{
		System.out.println(user);
		
		user.setUsername(username);
		userRepository.save(user);
		return user;
	}
}
