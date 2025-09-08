package com.gostudy.gos.vo;

import lombok.Data; // 롬복 사용
import java.time.LocalDateTime; // 회원가입 시간

@Data
public class MemberVO { // DB members 테이블
    private int memberId;          // member_id
    private String membername;     // membername
    private String password;     // password
    private String role;         // role (MENTOR/MENTEE)
    private LocalDateTime createdAt; // created_at
    private String memberEmail; // member_email
}