package com.project.project;


import java.util.ArrayList;
import java.util.List;

    public class Category {


        private long id;
        private String name;


        public Category() {
        }

        public Category(Long id, String name) {
            this.id = id;
            this.name = name;
        }
        private static List<com.project.project.Category> catList = new ArrayList<>();



        static {
            com.project.project.Category funny = new com.project.project.Category(0L, "Funny");
            com.project.project.Category android = new com.project.project.Category(1L, "Android");
            com.project.project.Category programming = new com.project.project.Category(2L, "Programming");
            catList.add(funny);
            catList.add(android);
            catList.add(programming);

        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static List<com.project.project.Category> getCatList() {
            return catList;
        }

        public static void setCatList(List<com.project.project.Category> catList) {
            com.project.project.Category.catList = catList;
        }
    }


