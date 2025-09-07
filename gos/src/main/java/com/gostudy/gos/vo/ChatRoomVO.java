package com.gostudy.gos.vo;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class ChatRoomVO { // DB chat_room ÂüÁ¶
    private int roomId;          // room_id
    private int mentorId;        // mentor_id
    private int menteeId;        // mentee_id
    private LocalDateTime createdAt; // created_at
}