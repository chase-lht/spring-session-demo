package com.offcn.controller;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {

    @GetMapping("/set")
    public String setSession(HttpSession session){
        session.setAttribute("abc","OneTwoThree");
        return "OK";
    }

    @GetMapping("/get")
    public String getSession(HttpSession session){
      return   (String) session.getAttribute("abc");

    }
}
