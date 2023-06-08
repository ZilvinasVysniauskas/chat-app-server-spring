package com.chat.app.chatapp.request;

import java.util.List;

public record RoomRequest(String name, String description, List<String> participants) {}
