package com.lekhraj.springmvc.cops.controller.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lekhraj.springmvc.cops.model.Auth;
import com.lekhraj.springmvc.cops.service.AuthManager;

@Controller
@RequestMapping("/auth")
public class AuthController {

	@Autowired(required=true)
    AuthManager authManager;
	
	//Redirect to aoe-create.jsp to create new aoe.
	@RequestMapping(method = RequestMethod.GET, value="/createaoe")
    public String createAoe(@ModelAttribute("auth") Auth aoe) 
    {
         return "auth/aoe-create";
    }
	
	//Display success/ Error page after submittng aoe request.
	@RequestMapping(method = RequestMethod.POST, value="/submitaoe")
    public String submitAoe(@ModelAttribute("auth") Auth aoe,BindingResult result, ModelMap model) 
    {
        //Store aoe in data
		//generate id
		// return acknowledgmemt with auth id
		if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("acct", aoe.getAcctId());
        model.addAttribute("approver", aoe.getApproverInit());
        model.addAttribute("id", 100);
        
		return "auth/aoe-created";
    }
     
     
}
