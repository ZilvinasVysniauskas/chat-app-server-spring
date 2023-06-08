package com.chat.app.chatapp.controller;

import com.chat.app.chatapp.model.chat.ChatRoom;
import com.chat.app.chatapp.request.RoomRequest;
import com.chat.app.chatapp.services.ChatRoomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chat-room")
public class ChatRoomController {

    private final ChatRoomService chatRoomService;

    public ChatRoomController(ChatRoomService chatRoomService) {
        this.chatRoomService = chatRoomService;
    }

    @PostMapping
    public ResponseEntity<ChatRoom> createChatRoom(@RequestBody RoomRequest roomRequest) {
        // Assuming ChatRoomService has a method to create a chat room
        ChatRoom chatRoom = chatRoomService.createChatRoom(roomRequest);

        // Optionally, you can return the created chat room ID in the response
        return ResponseEntity.status(HttpStatus.CREATED).body(chatRoom);
    }
}
