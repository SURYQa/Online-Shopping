package com.shoping.onlineshop.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.security.core.Authentication;
import com.shoping.onlineshop.dto.UserDto;
import com.shoping.onlineshop.entity.User;
import com.shoping.onlineshop.service.UserService;


@Controller

public class AuthController {
    private UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("/login")
    public String loginForm() {
        return "login";
    }

    @GetMapping("register")
    public String showRegistrationForm(Model model){
        UserDto user = new UserDto();
        model.addAttribute("user", user);
        return "register";
    }

    @PostMapping("/register/save")
    public String registration(@Valid @ModelAttribute("user") UserDto user,
                               BindingResult result,
                               Model model){
        User existing = userService.findByEmail(user.getEmail());
        if (existing != null) {
            result.rejectValue("email", null, "There is already an account registered with that email");
        }
        if (result.hasErrors()) {
            model.addAttribute("user", user);
            return "register";
        }
        userService.saveUser(user);
        return "redirect:/register?success";
    }

    @GetMapping("/mainpage")
    public String handleLoginSuccess(Authentication authentication) {
            authentication.getPrincipal();
            boolean isCustomer = authentication.getAuthorities().stream()
            .anyMatch(r -> r.getAuthority().equals("ROLE_CUSTOMER"));
        if (isCustomer) {
            return "/mainpage";
        } else {
            return "/login";
        }
    }
}

