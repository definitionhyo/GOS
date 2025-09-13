package com.gostudy.gos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.gostudy.gos.service.GosService;

@Controller // Controller ������ִ� ������̼�
public class GosController {

	@Autowired // �������� ���� ������̼�
	private GosService service;
	
	@GetMapping("createGosForm") // GOS ���� �� �̵�
	public String createGosForm() {
		return "gos/gos_createForm";
	}
	
	@GetMapping("viewGosList") // GOS ����Ʈ �̵�
	public String viewGosList() {
		return "gos/gos_viewGosList";
	}
	
	@PostMapping("createGosPro") // GOS ����
	public String createGosPro() {
		return "redirect:/myGosList";
	}
}
