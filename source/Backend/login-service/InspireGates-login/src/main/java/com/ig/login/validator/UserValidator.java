package com.ig.login.validator;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.ig.login.entity.UserDetails;
import com.ig.login.repo.UserDetailsRepository;

public class UserValidator {

	@Autowired
	UserDetailsRepository userDetailsRepository;

	@Autowired
	UserDetails userDetails;

	public boolean UserExist(Map<String, Object> userdata) {

		boolean result = false;
		String firstName;
		String lastName;

		try {

			firstName = (String) userdata.get("firstName");
			lastName = (String) userdata.get("lastName");
			String UserId = firstName + lastName;

			result = userDetailsRepository.getByUsername(UserId);
			if (result) {
				System.out.println("working");
			}
			else {
				System.out.println("not working");
			}
		} catch (Exception e) {
			result = false;
		} finally {

		}

		return result;
	}

}
