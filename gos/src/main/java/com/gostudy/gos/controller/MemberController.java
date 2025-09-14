package com.gostudy.gos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.gostudy.gos.service.MemberService;

@Controller // Controller ������ִ� ������̼�
public class MemberController {

	@Autowired // �������� �������ִ� ������̼�
	private MemberService service;
	
	@GetMapping("loginForm") // �α��� ȭ��
	public String loginForm() {
		return "member/member_loginForm"; // member/member_loginForm.jsp
	}
	
	@GetMapping("register") // ȸ������ �� �̵�
	public String register() {
		return "member/member_registerForm"; // member/member_registerForm.jsp
	}
	
	@PostMapping("registerPro") // ȸ������ �Ϸ� 
	public String registerPro() {
		return "member/member_register_complete";
	}
	
	@PostMapping("loginPro") // �α��� �Ϸ�
	public String loginPro() {
		return "main";
	}
	
	@GetMapping("myGosList") // ���������� ������Ʈ(���������� ����)
	public String myGosList() {
		return "member/member_mypage_main";
	}
	
	@GetMapping("mypage") // ���������� �̵�
	public String mypage() {
		return "member/member_mypage_main";
	}
	
	@GetMapping("myInfoEdit") // ���������� �������� ���� �̵�
	public String myInfoEdit() {
		return "member/member_mypage_infoEdit";
	}
	
	@PostMapping("changeMemberName") // ���������� �г��� ����
	public String changeMemberName() {
		return "toBeDeleted/changeNameSuccess";
	}
	
	@PostMapping("changeMemberPassword") // ���������� ��й�ȣ ����
	public String changeMemberPassword() {
		return "toBeDeleted/changePasswordSuccess";
	}
}
