package org.jtproject.tech_trekker.controller;

import org.jtproject.tech_trekker.dto.WriterRequest;
import org.jtproject.tech_trekker.mapper.WriterMapper;
import org.jtproject.tech_trekker.model.WriterInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class TechTrekkerController {
    @GetMapping({"/", "/home"})
    public String home() {
        return "home";
    }

    @GetMapping("/create-blog")
    public String createBlog() {
        return "create-blog";
    }

    @GetMapping("/sign-up")
    public String signup() {
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute WriterRequest request) {
        var writerInfo = WriterMapper.convertReqeust(request);
        System.out.println(writerInfo);
        return "home";
    }
    
}
