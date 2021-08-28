package com.ssafy.match.controller;

import com.ssafy.match.model.entity.User;
import com.ssafy.match.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/join")
    public String join(@RequestBody User user) {
        User newUser = userRepository.save(user);
        return user.getUsername() + "님의 회원가입을 환영합니다.";
    }
}
