package com.gostudy.gos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gostudy.gos.mapper.MemberMapper;
import com.gostudy.gos.vo.MemberVO;

@Service
public class MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	// 회원가입
	public int registMember(MemberVO member) {
		return memberMapper.insertMember(member);
	}

}
