package com.gostudy.gos.vo;

import lombok.Data; // �Һ� ���
import java.time.LocalDateTime; // ȸ������ �ð�

@Data
public class MemberVO { // DB members ���̺�
    private int memberId;          // member_id
    private String membername;     // membername
    private String password;     // password
    private String role;         // role (MENTOR/MENTEE)
    private LocalDateTime createdAt; // created_at
    private String memberEmail; // member_email
}