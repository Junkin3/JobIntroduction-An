/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oujava.controllers;

import com.oujava.service.UserService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author trann
 */
@Controller
public class LoginController {
     @Autowired
    private UserService userService;
     @GetMapping("/login")
    public String login(@RequestBody Map<String, String> loginRequest) {
        String input = loginRequest.get("input");
        String password = loginRequest.get("password");
       
        
        if (userService.login(input, password)) {
            return "redirect:/";
        } else {
            return "login";
        }
        
        
    }
}
