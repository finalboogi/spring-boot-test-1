package com.choco.spring.ex.ex2.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.net.InetAddress;

@Controller
public class ChocoWebController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello(Model model) throws Exception {
        String serverIp = InetAddress.getLocalHost().getHostAddress();

        model.addAttribute("helloMessage", "hello choco's world~!");
        model.addAttribute("serverIp", serverIp);

        return "index";
    }
}

