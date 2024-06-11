
package com.ig.login.service;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ig.login.validator.UserValidator;

@Service
public class UserService {

	public ResponseEntity<String> addUser(Map<String, Object> userdata) {
		UserValidator userValidator;

		try {
			userValidator = new UserValidator();

			boolean isUserExit = userValidator.UserExist(userdata);

			if (isUserExit) {

				return new ResponseEntity<>("user exist", HttpStatus.OK);

			} else {
				return new ResponseEntity<>("user not exist", HttpStatus.NOT_FOUND);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("Error", HttpStatus.BAD_REQUEST);
		}

	}

}
