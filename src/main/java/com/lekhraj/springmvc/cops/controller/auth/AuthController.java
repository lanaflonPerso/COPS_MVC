package com.lekhraj.springmvc.cops.controller.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lekhraj.springmvc.cops.model.Auth;
import com.lekhraj.springmvc.cops.service.AuthManager;

@Controller
@RequestMapping("/auth")
public class AuthController {

	@Autowired(required=true)
    AuthManager authManager;
	
	@RequestMapping(method = RequestMethod.GET, value="/createaoe")
    public String createAoeś(Model model) 
    {
         //Auth aoeVO = new Auth();
         //model.addAttribute("auth", aoeVO);
         return "auth/aoe-create";
    }
     
}
