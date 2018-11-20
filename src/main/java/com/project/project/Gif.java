package com.project.project;

import java.util.ArrayList;
import java.util.List;

public class Gif {

    List<String> list = new ArrayList<>();

    public List<String> addGifs () {
        list.add("gifs/android-explosion.gif");
        list.add("gifs/ben-and-mike.gif");
        list.add("gifs/book-dominos.gif");
        list.add("gifs/compiler-bot.gif");
        list.add("gifs/cowboy-coder.gif");
        list.add("gifs/infinite-andrew.gif");
        return list;
    }
}
