package com.example.springsecurityapplicationnew.controllers;

import com.example.springsecurityapplicationnew.models.Product;
import com.example.springsecurityapplicationnew.repositories.CategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController {


    @GetMapping("/authentication")
    public String login(){
        return "authentication";
    }

}
