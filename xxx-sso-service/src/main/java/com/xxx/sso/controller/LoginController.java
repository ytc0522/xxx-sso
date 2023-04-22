package com.xxx.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {


    @GetMapping("toLogin")
    public String toPage(){
        return "login";
    }


}
