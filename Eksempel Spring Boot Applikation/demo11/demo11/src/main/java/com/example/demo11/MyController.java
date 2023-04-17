package com.example.demo11;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class MyController {

    @GetMapping("/dataside")
    public String showMyPage(Model model) {
        MyClass myObject = new MyClass();
        myObject.setName("John");
        myObject.setStdnr(1);
        model.addAttribute("myObject", myObject);
        return "dataside";
    }

}


