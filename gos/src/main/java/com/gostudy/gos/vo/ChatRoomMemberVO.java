package com.gostudy.gos.vo;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ChatRoomMemberVO { // DB chat_room_member ÂüÁ¶
	private int chatRoomMemberId; // chat_room_member_id
	private int roomId; // room_id
	private int memberId; // member_id
	private LocalDateTime joinedAt; // joined_at
	
}
