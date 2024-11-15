package com.kelaskoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kelaskoding.service.ProductService;


@Controller
@RequestMapping("")
public class HomeController {

    @Autowired
    ProductService productService;

    @GetMapping
    public String welcome(Model model){
        // doing something 
        String message = "Welcome to MVC";
        model.addAttribute("msg", message);
        model.addAttribute("products", productService.findAll());
        return "index";
    }
    
}
