package com.lekhraj.springmvc.cops.service;

import org.springframework.stereotype.Service;

import com.lekhraj.springmvc.cops.model.Auth;


public interface AuthManager {
	
	Integer createAoe(Auth auth);
	
	boolean saveAuth(Auth auth);
	

}
