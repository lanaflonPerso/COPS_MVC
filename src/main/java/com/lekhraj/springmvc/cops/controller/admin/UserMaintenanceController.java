package com.lekhraj.springmvc.cops.controller.admin;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lekhraj.springmvc.cops.service.admin.UserMaintainenceService;

@Controller
public class UserMaintenanceController {

	@Autowired
	private UserMaintainenceService service;

	@RequestMapping(value = "/list-users", method = RequestMethod.GET)
	public String showUsers(ModelMap model) 
	{
		System.out.println("INside UserMaintenanceController > showUsers");
		model.addAttribute("users", service.retrieveUsers());
		return "list-users";
	}
	
	
	@RequestMapping(value = "/add-users", method = RequestMethod.GET)
	public String addUsers(ModelMap model) 
	{
		System.out.println("INside UserMaintenanceController > addUsers");
		return "add-users";
	}
	
	@RequestMapping(value = "/add-users", method = RequestMethod.POST)
	public String addUsers1(ModelMap model, @RequestParam String inits) 
	{
		System.out.println("INside UserMaintenanceController > addUsers1");
		service.addUser("", inits, "", new Date(), "");

		return "redirect:/list-users";
	}
	
	@RequestMapping(value = "/delete-users", method = RequestMethod.GET)
	public String deleteUsers(ModelMap model, @RequestParam String inits) 
	{
		System.out.println("INside UserMaintenanceController > deleteUsers");
		service.deleteUser(inits);

		return "redirect:/list-users";
	}
}