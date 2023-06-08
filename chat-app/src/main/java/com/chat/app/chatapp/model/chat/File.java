package com.chat.app.chatapp.model.chat;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "files")
public record File(
        @Id String id,
        String contentType,
        String fileName
) { }