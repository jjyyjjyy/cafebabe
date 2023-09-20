package com.example.web;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jy
 */
@RestController
public class DemoController {

    @GetMapping("/")
    public String index(@Value("${spring.application.name}") String name, HttpSession session) {

        return name;
    }
}
