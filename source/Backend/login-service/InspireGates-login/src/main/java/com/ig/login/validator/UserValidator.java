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
		String username ;
		UserDetails result1;

		try {

			firstName = (String) userdata.get("firstname");
			lastName = (String) userdata.get("secondname");
			username = (String) userdata.get("username");
			String UserId = firstName + "_"+lastName;
			System.out.println("UserId"+UserId);
			result1 = userDetailsRepository.getByUsername(UserId);
			if (result1 != null) {
				System.out.println("working");
				result=true;
			}
			else {
				System.out.println("not working");
			}
		} catch (Exception e) {
			result = false;
			e.printStackTrace();
		} finally {

		}

		return result;
	}

}
