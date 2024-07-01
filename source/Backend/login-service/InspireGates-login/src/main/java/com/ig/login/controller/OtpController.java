package com.ig.login.controller;


import com.ig.login.service.OtpService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OtpController {

	@Autowired
	private OtpService otpService;

	@PostMapping("/send-otp")
	public ResponseEntity<String> sendOtpEmail(@RequestBody Map<String, String> requestBody) {
		try {
			String email = requestBody.get("email");
			if (email == null) {
				return ResponseEntity.badRequest().body("Email and OTP must be provided in the request body");
			}
			otpService.sendOtp(email);
			return ResponseEntity.ok("OTP email sent successfully to " + email);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(500).body("Failed to send OTP email");
		}
	}
	
	  @PostMapping("/validate-otp")
	    public ResponseEntity<String> validateOtp(@RequestBody Map<String, String> requestBody) {
	        try {
	            String email = requestBody.get("email");
	            String otp = requestBody.get("otp");
	            if (email == null || otp == null) {
	                return ResponseEntity.badRequest().body("Email and OTP must be provided in the request body");
	            }
	            boolean isValid = otpService.validateOtp(email, otp);
	            if (isValid) {
	                return ResponseEntity.ok("OTP is valid");
	            } else {
	                return ResponseEntity.badRequest().body("Invalid OTP");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	            return ResponseEntity.status(500).body("Failed to validate OTP");
	        }
	    }
	
	
}
