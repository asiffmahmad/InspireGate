package com.ig.login.validator;

import java.util.List;
import java.util.Map;
import java.util.Optional;

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
            System.out.println("UserId>>>" + username+"<<<<");
           // UserDetails userDetails = userDetailsRepository.findByUsername(username);
            //System.out.println("userDetails>>"+userDetails);


                UserDetails newUser = new UserDetails();
                newUser.setUsername((String) userdata.get("username"));
                newUser.setFirstname((String) userdata.get("firstname"));
                newUser.setSecondname((String) userdata.get("secondname"));
                newUser.setEmail((String) userdata.get("email"));
                newUser.setPhno((String) userdata.get("phno"));
                newUser.setAdd1((String) userdata.get("add1"));
                newUser.setAdd2((String) userdata.get("add2"));
                userDetailsRepository.save(newUser);
                result=false;
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}
