package com.dis.mvc;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MuController {

	
	@RequestMapping("/login")
	public String login(Model model, HttpServletRequest request) {
		//　表示JSP画面
		return "login";
	}
	
	@RequestMapping("hello")
	public String index(Model model, HttpServletRequest request) {
		
		Map userMap = new HashMap();
		//　ログインユーザ
		userMap.put("key1","User01");
		userMap.put("key2","User02");
		userMap.put("key3","User03");
		model.addAttribute("userMap", userMap);

		HttpSession session =request.getSession();
		Object loginUserId = session.getAttribute("UserID");
		
		if (loginUserId == null) {
			//存在しないの場合　ログイン画面
			return "showMessage";
		} else
		{
			//Session存在の場合
			//　成功画面に遷移(JSPファイル)
			model.addAttribute("userid",loginUserId.toString());
			return "index";
		}
	}


	@RequestMapping(path = "/post", method = RequestMethod.POST)
	public String Display(Model model, HttpServletRequest request) {

		String userID = request.getParameter("UserID");
		HttpSession session =request.getSession();
		Object loginUserId = session.getAttribute(userID);
		session.setAttribute("UserID", userID);
		model.addAttribute("userid",userID);
		return "index";
	} 
}
