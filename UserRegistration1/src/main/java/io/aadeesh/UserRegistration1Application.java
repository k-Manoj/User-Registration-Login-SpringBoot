package io.aadeesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan(basePackages = "UserController.java," + "User.java," + "UserRepository.java")
public class UserRegistration1Application 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(UserRegistration1Application.class, args);
	}
	
}
