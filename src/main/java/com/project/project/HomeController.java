package com.project.project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(ModelMap map){
        Gif gif = new Gif();
        map.put("memes", gif.addGifs());
        return "home";
    }
    @GetMapping("/categories")
    public String categories(ModelMap map){
        map.put("categories", Category.getCatList());
        return "categories";
    }

    @GetMapping("/category/{id}")
    public String category(@PathVariable int id, ModelMap map){
        Category category= Category.getCatList().get(id);
        map.put("category", category );
        List<Gif> gifs = Gif.getGifsByCategoryName(category.getName());
        map.put("memes",Gif.getGifsByCategoryName(category.getName()));
        return "/category";
    }
}