
package com.ig.login.service;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ig.login.validator.UserValidator;

@Service
public class UserService {

	public ResponseEntity<String> addUser(Map<String, Object> userdata) {
		UserValidator userValidator;
		
		
		try {
			userValidator = new UserValidator();
			
			userValidator.UserExist(userdata);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
