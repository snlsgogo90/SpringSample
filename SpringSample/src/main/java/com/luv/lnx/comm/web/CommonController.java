package com.luv.lnx.comm.web;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv.lnx.comm.model.CommonVo;
import com.luv.lnx.comm.service.CommonService;

@Controller
public class CommonController {
	
	@Autowired
	private MessageSource message;
	
	@RequestMapping(value = "/comm/main")
	public String main(Locale locale, Model model) {
		System.out.println(locale.toString());
		model.addAttribute("message", "main");
		return "/comm/main";
	}
	
	@RequestMapping(value = "/comm/loginCheck")
	public String loginCheck(CommonVo commonVo, Model model) {
		
		return "";
	}
	
}
