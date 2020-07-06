package com.luv.lnx.comm.web;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv.lnx.comm.service.CommonService;

@Controller
public class CommonController {
	
	@Autowired
	private MessageSource message;
	
	@Autowired
	private CommonService service;
	
	@RequestMapping(value = "/comm/main.do")
	public String main(Locale locale, Model model) {
		System.out.println(locale.toString());
		model.addAttribute("message", "main");
		return "/comm/main";
	}
	
	@RequestMapping(value = "/comm/login.do")
	public String login() {
		
		return "";
	}
	
}
