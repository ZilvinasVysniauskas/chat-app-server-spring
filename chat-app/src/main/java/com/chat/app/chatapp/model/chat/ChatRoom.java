package com.chat.app.chatapp.model.chat;

import com.chat.app.chatapp.model.user.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "chatrooms")
public record ChatRoom(
        @Id String id,
        String name,
        String description,
        @DBRef List<User> participants,
        @DBRef List<Message> messages
) {}