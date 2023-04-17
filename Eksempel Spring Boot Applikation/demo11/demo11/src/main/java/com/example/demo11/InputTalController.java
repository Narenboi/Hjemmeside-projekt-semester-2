package com.example.demo11;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class InputTalController {

	@GetMapping("/inputtal/{num1}/{num2}")
    public String add(@PathVariable int num1, @PathVariable int num2, Model model) {
        int sum = num1 + num2;
        model.addAttribute("sum", sum);
        return "vissum";
    }


}



