package com.v4s.registeration;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.v4s.insurance.aplt.User;
import com.v4s.insurance.apltimpl.UserImpl;


@Controller

public class UserController{

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	

	@RequestMapping(value="/registration",method=RequestMethod.POST)
	public String test(HttpServletRequest request,HttpServletResponse response) {
		User user = new UserImpl();

		if(user.register(request, response)) {
			return "redirect:/login";
		}
		else
		{
			return "redirect:/registration";
		}
	}
	
	@RequestMapping(value="/registration",method=RequestMethod.GET)
	public String register() {
		return "registration";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String log() {

		return "login";
	}
@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(HttpServletRequest request,HttpServletResponse response) {
		User user = new UserImpl();

		if(user.login(request, response))
			return "redirect:/user";
		else {
			return "redirect:/login";
		}
	}
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public String user() {

		return "user";
	}

}