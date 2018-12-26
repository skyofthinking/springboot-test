package com.neo.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String hello(Model model, HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("info1", request.getLocalAddr() + ":" + request.getLocalPort());
        model.addAttribute("info2", request.getSession().getId());
        return "home";
    }

}
