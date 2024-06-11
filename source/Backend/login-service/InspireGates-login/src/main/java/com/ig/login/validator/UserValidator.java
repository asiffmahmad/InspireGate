package com.ig.login.validator;

import java.util.Map;

public class UserValidator {

	public boolean UserExist(Map<String, Object> userdata) {

		boolean result = false;

		try {

			result = true;

		} catch (Exception e) {
			result = false;
		} finally {

		}

		return result;
	}

}
