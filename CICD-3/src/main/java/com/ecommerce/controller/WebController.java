package com.ecommerce.controller;

import com.ecommerce.model.User;
import com.ecommerce.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class WebController {

    private final ProductService productService;

    public WebController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping({"/","/login"})
    public String loginPage(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String doLogin(User user, HttpSession session) {
        if ("admin".equals(user.getUsername()) && "password".equals(user.getPassword())) {
            session.setAttribute("user", user.getUsername());
            return "redirect:/home";
        }
        return "redirect:/login?error=true";
    }

    @GetMapping("/home")
    public String home(Model model, HttpSession session) {
        Object u = session.getAttribute("user");
        if (u == null) {
            return "redirect:/login";
        }
        model.addAttribute("products", productService.getProducts());
        model.addAttribute("username", u.toString());
        return "home";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
