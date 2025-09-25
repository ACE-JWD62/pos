package jwd.pos.features.auth.controller;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
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
    public String login(HttpServletRequest request, @ModelAttribute LoginRequest loginRequest, Model model) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();
        System.out.println("Name => " + username);
        System.out.println("Password => " + password);
        if (username.equals("Orion") && password.equals("password")) {
            HttpSession session = request.getSession();
            session.setAttribute("username",username);
            return "redirect:/admin/dashboard";
        }
        return "index";
    }

}
