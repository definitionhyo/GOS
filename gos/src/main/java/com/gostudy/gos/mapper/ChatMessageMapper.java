package com.gostudy.gos.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gostudy.gos.vo.ChatMessageVO;

public interface ChatMessageMapper {

    // 1. �޽��� ����
    int insertMessage(ChatMessageVO message);

    // 2. ä�ù� �޽��� ��ȸ
    List<ChatMessageVO> selectMessagesByRoom(@Param("roomId") int roomId);

    // 3. �޽��� ����
    int deleteMessage(@Param("messageId") int messageId);
}