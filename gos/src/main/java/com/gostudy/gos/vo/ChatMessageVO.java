package com.gostudy.gos.vo;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class ChatMessageVO { // DB chat_message ÂüÁ¶
    private int messageId;       // message_id
    private int roomId;          // room_id
    private int senderId;        // sender_id
    private String message;      // message
    private LocalDateTime sentAt; // sent_at
}