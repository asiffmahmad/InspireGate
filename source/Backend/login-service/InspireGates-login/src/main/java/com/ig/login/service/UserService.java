package com.ig.login.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.ig.login.validator.UserValidator;
import java.util.Map;

@Service
public class UserService {

	private final UserValidator userValidator;

	public UserService(UserValidator userValidator) {
		this.userValidator = userValidator;
	}

	public ResponseEntity<String> addUser(Map<String, Object> userdata) {
		try {
			boolean isUserExist = userValidator.UserExist(userdata);

			if (isUserExist) {
				return new ResponseEntity<>("user exist", HttpStatus.OK);
			} else {
				return new ResponseEntity<>("user not exist", HttpStatus.NOT_FOUND);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("Error", HttpStatus.BAD_REQUEST);
		}
	}

	public boolean deleteUserByUsername(String username) {
		try {
			return userValidator.deleteByUsername(username);

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
