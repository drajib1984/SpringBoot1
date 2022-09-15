package com.springboottutorial.Employee.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class HelloWorld {
    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("title","Welcome Rajib");
        model.addAttribute("message","Hello World");
        return "helloworld";
    }

    @GetMapping("/hello/zap")
    public String hellozapp(){
        return "Hello fgdgdgdg  Zapper!!";
    }
}
