package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class forsideController {

    @GetMapping("/")
    public String  visForside(){
        return "forside";
    }

}