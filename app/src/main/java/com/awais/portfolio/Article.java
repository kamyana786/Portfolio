package com.awais.portfolio;

public class Article {
    String name;
    String reg;
    String description;
    int image;

    public Article(String name, String reg, String description, int image) {
        this.name = name;
        this.reg = reg;
        this.description = description;
        this.image = image;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReg() {
        return reg;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
    }




