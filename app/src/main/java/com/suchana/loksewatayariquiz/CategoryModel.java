package com.suchana.loksewatayariquiz;

public class CategoryModel {
    private String name, url;
    private int sets;
    public CategoryModel(){
        //empty constructor for firebase
    }
    public CategoryModel(String name, String url, int sets) {
        this.name = name;
        this.url = url;
        this.sets = sets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }
}