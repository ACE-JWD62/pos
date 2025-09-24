package jwd.pos.features.auth.controller;


import jwd.pos.model.dto.LoginRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/auth")
public class AuthController {



    @PostMapping("/login")
    public String login(@ModelAttribute LoginRequest loginRequest, Model model) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();

        System.out.println(username);



        return "index";
    }
}
