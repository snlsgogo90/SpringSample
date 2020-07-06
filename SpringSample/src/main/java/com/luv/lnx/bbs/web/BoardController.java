package com.luv.lnx.bbs.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	
	@RequestMapping(value = "/bbs/boardList.do")
	public String getBoardList(Model model) {
		
		return "/bbs/boardList";
	}
	
}
