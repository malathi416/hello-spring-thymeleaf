package org.launchcode.hellospringthymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloSpringThymeleafController {

    //Responds to /hello?name=LaunchCode
    @RequestMapping(value = "hello",method = {RequestMethod.GET,RequestMethod.POST})
    public String hello(@RequestParam String name, Model model){
        String greeting = "Hello , " + name + "!";
        model.addAttribute("greeting",greeting);
        return "hello";
    }
    @GetMapping("hello/{name}")
    public String helloAgain(@PathVariable String name,Model model){
        String greeting = "Hello , " + name + "!";
        model.addAttribute("greeting",greeting);
        return "hello";
    }
    @GetMapping("form")
    public String helloForm(){
        return "form";
    }

}
