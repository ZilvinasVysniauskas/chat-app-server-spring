package com.chat.app.chatapp.services;

import com.chat.app.chatapp.model.chat.ChatRoom;
import com.chat.app.chatapp.repository.ChatRoomRepository;
import com.chat.app.chatapp.request.RoomRequest;
import org.springframework.stereotype.Service;


@Service
public class ChatRoomService {

    private final ChatRoomRepository chatRoomRepository;

    public ChatRoomService(ChatRoomRepository chatRoomRepository) {
        this.chatRoomRepository = chatRoomRepository;
    }

    public ChatRoom createChatRoom(RoomRequest roomRequest) {
        ChatRoom chatRoom = new ChatRoom(null, roomRequest.name(), roomRequest.description(), null, null);
        return chatRoomRepository.save(chatRoom);
    }


}
