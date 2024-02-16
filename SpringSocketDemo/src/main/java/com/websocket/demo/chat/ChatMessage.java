package com.websocket.demo.chat;

import lombok.Builder;
import lombok.Getter;
@Getter
@Builder
public class ChatMessage {
    @Getter
    static private int count=0;
    private int countEx;
    private String content;
    private String timestamp;
    private String sender;
    private MessageType type;

    public static void Count(int i){
        count += i;
    }
    public void setEx(){
        countEx = count;
    }
}