package com.example.RegisterLogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class RegisterLoginApplication {
//	@Autowired
//	private PasswordEncoder passwordEncoder;


	public static void main(String[] args) {
		SpringApplication.run(RegisterLoginApplication.class, args);
		System.out.println("hii");
	}
//	public void run(String... args) throws Exception {
//		System.out.println("Passowrd is"+this.passwordEncoder.encode("pappu"));
//	}

}
