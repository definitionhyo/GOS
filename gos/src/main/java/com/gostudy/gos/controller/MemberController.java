package com.gostudy.gos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.gostudy.gos.service.MemberService;

@Controller // Controller 명시해주는 어노테이션
public class MemberController {

	@Autowired // 의존관계 주입해주는 어노테이션
	private MemberService service;
	
	@GetMapping("loginForm") // 로그인 화면
	public String loginForm() {
		return "member/member_loginForm"; // member/member_loginForm.jsp
	}
	
	@GetMapping("register") // 회원가입
	public String registerForm() {
		return "member/member_registerForm"; // member/member_registerForm.jsp
	}
	
	
}
