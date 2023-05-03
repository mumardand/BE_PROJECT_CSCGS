package com.bitRoute.controller;

import com.bitRoute.service.login.LoginService;
import com.bitRoute.service.score.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginContoller {
    @Autowired
    private LoginService loginService;
}
