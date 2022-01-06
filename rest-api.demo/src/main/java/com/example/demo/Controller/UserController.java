package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.exception.UserNotFoundException;
import com.example.demo.service.UserService;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/v1/users")
	public ResponseEntity<List<User>>getAllUsers(){
		return new ResponseEntity<>(userService.getAlluser(),HttpStatus.OK);
	}
	@PostMapping("v1/users")
	public ResponseEntity<String> addUser(@RequestBody User user) {
	userService.addUser(user);
	return new ResponseEntity<String>("Successfully added the user", HttpStatus.CREATED);
	}

	 @GetMapping("v1/users/{id}")
	public ResponseEntity<?> getUserById(@PathVariable("id") int id) throws UserNotFoundException{
	java.util.Optional<User> user = userService.getUserById(id);
	if(!user.isPresent()) {
		throw new UserNotFoundException("User with the given id is not found:"+id);
	}
	
	return new ResponseEntity<>(user, HttpStatus.OK);
	}
	@GetMapping("/users")
	public ResponseEntity<List<User>> getUsersByName(@RequestHeader("x-api-version")String version,@RequestParam String name){
	return new ResponseEntity<List<User>>(userService.getUserByName(name),HttpStatus.OK);
	}
	}


