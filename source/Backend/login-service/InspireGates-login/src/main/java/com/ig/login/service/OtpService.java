package com.ig.login.service;

import java.util.Random;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import com.ig.login.configration.CryptoUtil;

@Service
public class OtpService {

	@Autowired
	private JavaMailSender javaMailSender;

	private static final String CHARACTERS = "0123456789";
	private SecretKey secretKey;

	public OtpService() throws Exception {
		// Generate a secret key and convert it to a string for storage
		this.secretKey = CryptoUtil.generateKey();
	}

	public void sendOtp(String toEmail) {
		SimpleMailMessage message = new SimpleMailMessage();
		String otp = generateNumericOTP(6);
		try {
			String encryptedOtp = CryptoUtil.encrypt(otp, secretKey);
			// encryptedOtp this need to store in db

			message.setTo(toEmail);
			message.setSubject("Your OTP Code");
			message.setText("Your OTP code is: " + otp);
			javaMailSender.send(message);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static String generateNumericOTP(int length) {
		long currentTimeMillis = System.currentTimeMillis();
		Random random = new Random(currentTimeMillis);

		StringBuilder otp = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			otp.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
		}
		return otp.toString();
	}

	public boolean validateOtp(String email, String otp) {
		boolean result ;
		try {
			// need to get the otp by passing 
			String encryptedOtp = null; // Retrieve encrypted OTP from the database
			if (encryptedOtp == null) {
				return false;
			}
			// Decrypt stored OTP and compare with provided OTP
			String decryptedOtp = CryptoUtil.decrypt(encryptedOtp, secretKey);
			result= decryptedOtp.equals(otp);
			if (result) {
				//need to update as user created sucessfull
				
			} else {
				//need to update as user not created sucessfull

			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
