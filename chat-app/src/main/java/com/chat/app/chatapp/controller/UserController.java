package com.chat.app.chatapp.controller;

import com.chat.app.chatapp.dto.user.UserResponse;
import com.chat.app.chatapp.security.CurrentUser;
import com.chat.app.chatapp.security.UserPrincipal;
import com.chat.app.chatapp.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/profile")
    @PreAuthorize("hasRole('USER')")
    public UserResponse getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userService.getUserResponse(userPrincipal.getId());
    }
}