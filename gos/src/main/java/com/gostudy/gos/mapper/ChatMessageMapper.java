package com.gostudy.gos.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gostudy.gos.vo.ChatMessageVO;

public interface ChatMessageMapper {

    // 1. 메시지 전송
    int insertMessage(ChatMessageVO message);

    // 2. 채팅방 메시지 조회
    List<ChatMessageVO> selectMessagesByRoom(@Param("roomId") int roomId);

    // 3. 메시지 삭제
    int deleteMessage(@Param("messageId") int messageId);
}