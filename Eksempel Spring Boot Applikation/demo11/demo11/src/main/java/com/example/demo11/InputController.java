package com.example.demo11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

@RestController
public class InputController {

    @GetMapping("/example")
    public String example(@RequestParam(name = "name") String name,
                          @RequestParam(name = "age") int age, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "name="+name;
    }
}

