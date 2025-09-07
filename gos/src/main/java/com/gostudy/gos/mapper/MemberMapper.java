package com.gostudy.gos.mapper;

import java.util.List; // 여러 개의 회원 데이터를 조회하기 위해 import
import org.apache.ibatis.annotations.Param; // SQL 쿼리에서 파라미터 이름 지정용 어노테이션 import
import com.gostudy.gos.vo.MemberVO;

public interface MemberMapper {

    // 1. 회원 등록
    int insertMember(MemberVO member);

    // 2. 회원 조회 (ID 기준)
    MemberVO selectMemberById(@Param("memberId") int memberId);

    // 3. 전체 회원 조회
    List<MemberVO> selectAllMember();

    // 4. 회원 정보 수정
    int updateMember(MemberVO member);

    // 5. 회원 삭제
    int deleteMember(@Param("memberId") int memberId);
    
}