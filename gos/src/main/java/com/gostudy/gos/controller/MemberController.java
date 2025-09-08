package com.gostudy.gos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.gostudy.gos.service.MemberService;

@Controller // Controller ������ִ� ������̼�
public class MemberController {

	@Autowired // �������� �������ִ� ������̼�
	private MemberService service;
	
	@GetMapping("loginForm") // �α��� ȭ��
	public String loginForm() {
		return "member/member_loginForm"; // member/member_loginForm.jsp
	}
	
	@GetMapping("register") // ȸ������
	public String registerForm() {
		return "member/member_registerForm"; // member/member_registerForm.jsp
	}
	
	
}
