package com.gostudy.gos.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gostudy.gos.vo.ChatRoomVO;

public interface ChatRoomMapper {

    // 1. 채팅방 생성
    int insertChatRoom(ChatRoomVO chatRoom);

    // 2. 채팅방 조회 (멘토/멘티 기준)
    ChatRoomVO selectChatRoom(@Param("mentorId") int mentorId, @Param("menteeId") int menteeId);

    // 3. 채팅방 목록 조회 (멘토/멘티 기준)
    List<ChatRoomVO> selectChatRoomsByMember(@Param("memberId") int memberId);

    // 4. 채팅방 삭제
    int deleteChatRoom(@Param("roomId") int roomId);
}