
package com.lekhraj.springmvc.cops.service.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("cops") && password.equals("cops");
	}

}