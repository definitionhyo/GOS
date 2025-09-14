package com.gostudy.gos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.gostudy.gos.service.MemberService;

@Controller // Controller 명시해주는 어노테이션
public class MemberController {

	@Autowired // 의존관계 주입해주는 어노테이션
	private MemberService service;
	
	@GetMapping("loginForm") // 로그인 화면
	public String loginForm() {
		return "member/member_loginForm"; // member/member_loginForm.jsp
	}
	
	@GetMapping("register") // 회원가입 뷰 이동
	public String register() {
		return "member/member_registerForm"; // member/member_registerForm.jsp
	}
	
	@PostMapping("registerPro") // 회원가입 완료 
	public String registerPro() {
		return "member/member_register_complete";
	}
	
	@PostMapping("loginPro") // 로그인 완료
	public String loginPro() {
		return "main";
	}
	
	@GetMapping("myGosList") // 마이페이지 고스리스트(마이페이지 메인)
	public String myGosList() {
		return "member/member_mypage_main";
	}
	
	@GetMapping("mypage") // 마이페이지 이동
	public String mypage() {
		return "member/member_mypage_main";
	}
	
	@GetMapping("myInfoEdit") // 마이페이지 개인정보 수정 이동
	public String myInfoEdit() {
		return "member/member_mypage_infoEdit";
	}
	
	@PostMapping("changeMemberName") // 마이페이지 닉네임 변경
	public String changeMemberName() {
		return "toBeDeleted/changeNameSuccess";
	}
	
	@PostMapping("changeMemberPassword") // 마이페이지 비밀번호 변경
	public String changeMemberPassword() {
		return "toBeDeleted/changePasswordSuccess";
	}
}
