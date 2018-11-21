package com.project.project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(ModelMap map){
        Gif gif = new Gif();
        map.put("memes", gif.addGifs());
        return "home";
    }

    @GetMapping("/categories")
    public String cat(ModelMap modelMap){
        return "/categories";
    }
}
