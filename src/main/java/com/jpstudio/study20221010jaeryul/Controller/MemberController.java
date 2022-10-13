package com.jpstudio.study20221010jaeryul.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {
    @GetMapping("/member/Login")
    public String Login() {
        return "member/Login";
    }

    @GetMapping("/member/SignUp")
    public String SignUp() {
        return "member/SignUp";
    }
}
