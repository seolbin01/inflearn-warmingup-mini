package com.group.miniproject.controller.user;

import com.group.miniproject.dto.user.request.UserCreateRequest;
import com.group.miniproject.service.user.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/member")
    public void saveUser(@RequestBody UserCreateRequest request) {
        userService.saveUser(request);
    }


}
