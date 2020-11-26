package be.ifosup.glvp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Controller pour la page login
 * */
@Controller
@RequestMapping("/login")
public class LoginController {
    @GetMapping
    public String loginPage() {
        return "/index";
    }
}