package com.ig.login.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ig.login.service.UserService;

@RestController
@RequestMapping("/MainMenu")
public class MainController {
	
	@Autowired
	UserService userService;

	@PostMapping("/")
	public String test() {

		return "InspireGates-login Maincontroller is up";

	}

	@PostMapping("/adduser")
	public ResponseEntity<String> createUSer(@RequestBody Map<String, Object> userdata) {

		return userService.addUser(userdata);

	}

}
