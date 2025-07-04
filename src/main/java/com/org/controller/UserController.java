package com.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.entity.User;
import com.org.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> getAllUsers(){
		return userService.getAll();
	}
	
	@PostMapping
	public void createUser(@RequestBody User user) {
		userService.saveEntry(user);
	}
	
//	@PostMapping
//	public ResponseEntity<?> updateUser(@RequestBody User user){
//		User userInDB = userService.findByUserName(user.getUserName());
//		if (userInDB != null) {
//			userInDB.setUserName(user.getUserName());
//			userInDB.setPassword(user.getPassword());
//			
//		}
//		return new ResponseEntity<>(HttpStatus.NO_CONTENT); 
//	}

}
