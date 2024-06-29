package com.ig.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ig.login.entity.UserDetails;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {
    
    // Custom query method to find a user by username
    UserDetails findByUsername(String username);
    
    void deleteByUsername(String username); // Add this method

    // Additional custom query methods can be added here if needed
}
