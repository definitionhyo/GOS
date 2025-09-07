package com.gostudy.gos.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.gostudy.gos.vo.ChatRoomVO;

public interface ChatRoomMapper {

    // 1. ä�ù� ����
    int insertChatRoom(ChatRoomVO chatRoom);

    // 2. ä�ù� ��ȸ (����/��Ƽ ����)
    ChatRoomVO selectChatRoom(@Param("mentorId") int mentorId, @Param("menteeId") int menteeId);

    // 3. ä�ù� ��� ��ȸ (����/��Ƽ ����)
    List<ChatRoomVO> selectChatRoomsByMember(@Param("memberId") int memberId);

    // 4. ä�ù� ����
    int deleteChatRoom(@Param("roomId") int roomId);
}