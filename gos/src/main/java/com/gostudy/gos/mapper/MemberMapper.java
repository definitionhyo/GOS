package com.gostudy.gos.mapper;

import java.util.List; // ���� ���� ȸ�� �����͸� ��ȸ�ϱ� ���� import
import org.apache.ibatis.annotations.Param; // SQL �������� �Ķ���� �̸� ������ ������̼� import
import com.gostudy.gos.vo.MemberVO;

public interface MemberMapper {

    // 1. ȸ�� ���
    int insertMember(MemberVO member);

    // 2. ȸ�� ��ȸ (ID ����)
    MemberVO selectMemberById(@Param("memberId") int memberId);

    // 3. ��ü ȸ�� ��ȸ
    List<MemberVO> selectAllMember();

    // 4. ȸ�� ���� ����
    int updateMember(MemberVO member);

    // 5. ȸ�� ����
    int deleteMember(@Param("memberId") int memberId);
    
}