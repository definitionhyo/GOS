package com.gostudy.gos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.gostudy.gos.service.GosService;

@Controller // Controller 명시해주는 어노테이션
public class GosController {

	@Autowired // 의존관계 주입 어노테이션
	private GosService service;
	
	@GetMapping("createGosForm") // GOS 생성 뷰 이동
	public String createGosForm() {
		return "gos/gos_createForm";
	}
	
	@GetMapping("viewGosList") // GOS 리스트 이동
	public String viewGosList() {
		return "gos/gos_viewGosList";
	}
	
}
