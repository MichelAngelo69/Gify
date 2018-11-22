package com.project.project;



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Gif {
    // private long id;
    private String name;
    private Category category;


    private  static List<Gif> list = new ArrayList<>();

    public Gif(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    public Gif() {
    }

    static {
        Category android = Category.getCatList().get(0);
        Category funny = Category.getCatList().get(1);
        Category programming = Category.getCatList().get(2);

        list.add(new Gif("/gifs/android-explosion.gif",android));
        list.add(new Gif("/gifs/ben-and-mike.gif",funny));
        list.add(new Gif("/gifs/book-dominos.gif",funny));
        list.add(new Gif("/gifs/compiler-bot.gif", android));
        list.add(new Gif("/gifs/cowboy-coder.gif", programming));
        list.add(new Gif("/gifs/infinite-andrew.gif", programming));
    }


    public static List<Gif> addGifs () {
        return list;
    }

    public static List<Gif> getGifsByCategoryName(String name){
        return list.stream().filter(gif -> gif.getCategory().getName().equals(name)).collect(Collectors.toList());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
