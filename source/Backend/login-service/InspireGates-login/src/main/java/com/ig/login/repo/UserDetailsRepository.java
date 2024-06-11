package com.ig.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ig.login.entity.UserDetails;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {
	
	
	
	public UserDetails getById(Integer id);
	public UserDetails getByUsername(String username);
	

}
