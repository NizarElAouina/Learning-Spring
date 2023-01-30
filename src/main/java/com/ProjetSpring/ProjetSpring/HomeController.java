package com.ProjetSpring.ProjetSpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping("")
    public String home(){
        return "home";
    }

    @GetMapping("/admin")
    public String admin(){
        return "This is admin page";
    }

    @GetMapping("/login")
    public String login(){
        return "/login";
    }

    @GetMapping("/users")
    public String users(){
        return "/users";
    }


}
