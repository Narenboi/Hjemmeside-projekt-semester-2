package com.example.demo11;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class StuderendeController {

    @GetMapping("/studerende")
    public String showStuderende(Model model) {
        MyClass[] myObjects = new MyClass[3];
        myObjects[0] = new MyClass("Pernille",1);
        myObjects[1] = new MyClass("Jane", 25);
        myObjects[2] = new MyClass("Bob", 40);
        model.addAttribute("myObjects", myObjects);
        return "studerende";
    }

}
