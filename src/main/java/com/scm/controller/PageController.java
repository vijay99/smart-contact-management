package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class PageController {

    @RequestMapping("/home")
    public String getMethodName(Model model) {
        System.out.println("Home page handler");
        model.addAttribute("name", "Rashmika Mandahana");
        model.addAttribute("Profession", "Actress");
        model.addAttribute("HomeTown", "Corrg,Karnataka");
        model.addAttribute("GitHubRepo", "https://github.com/vijay99");
        return "home";
    }
    


}
