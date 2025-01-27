package com.kelaskoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kelaskoding.dto.SearchFormData;
import com.kelaskoding.entity.Product;
import com.kelaskoding.service.ProductService;

@Controller
@RequestMapping("")
public class HomeController {

    @Autowired
    ProductService productService;

    @GetMapping
    public String welcome(Model model) {
        // doing something
        String message = "Welcome to MVC";
        model.addAttribute("msg", message);
        model.addAttribute("searchFormData", new SearchFormData());
        model.addAttribute("products", productService.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String add(Model model) {
        // doing something
        String message = "add product";
        model.addAttribute("msg", message);
        model.addAttribute("product", new Product());
        return "add";
    }

    @PostMapping("/save")
    public String save(Product product) {
        // doing something
        productService.add(product);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        // doing something
        productService.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "edit";
    }

    @PostMapping("/update")
    public String save(Product product, Model model) {
        // call service update
        productService.updateProduct(product);
        return "redirect:/";
    }

    @PostMapping("/search")
    public String seacrh(SearchFormData searchFormData, Model model) {
        {
            // doing something
            String message = "add product";
            model.addAttribute("msg", message);
            model.addAttribute("searchFormData", searchFormData);
            model.addAttribute("products", productService.findByNameContains(searchFormData.getKeyword()));
            return "index";
        }
    }
}