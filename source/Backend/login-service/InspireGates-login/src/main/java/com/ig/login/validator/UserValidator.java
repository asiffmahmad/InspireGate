package com.ig.login.validator;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ig.login.entity.UserDetails;
import com.ig.login.repo.UserDetailsRepository;

@Component
public class UserValidator {

	@Autowired
	private UserDetailsRepository userDetailsRepository;

	public boolean UserExist(Map<String, Object> userdata) {
		boolean result = false;
		String username;
		try {
			username = (String) userdata.get("username");
			System.out.println("UserId>>>" + username + "<<<<");
			UserDetails userDetails = userDetailsRepository.findByUsername(username);
			if (userDetails == null) {
				UserDetails newUser = new UserDetails();
				newUser.setUsername((String) userdata.get("username"));
				newUser.setFirstname((String) userdata.get("firstname"));
				newUser.setSecondname((String) userdata.get("secondname"));
				newUser.setEmail((String) userdata.get("email"));
				newUser.setPhno((String) userdata.get("phno"));
				newUser.setAdd1((String) userdata.get("add1"));
				newUser.setAdd2((String) userdata.get("add2"));
				userDetailsRepository.save(newUser);
				result = false;
			} else {
				System.out.println("user is alreday avaoilable in database>>" + userDetails.getUsername());
				result = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public boolean deleteByUsername(String username) {
        try {
            UserDetails userDetails = userDetailsRepository.findByUsername(username);
            if (userDetails != null) {
                userDetailsRepository.deleteByUsername(username);
                return true;
            } else {
                System.out.println("User not found with username: " + username);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

	}

}
