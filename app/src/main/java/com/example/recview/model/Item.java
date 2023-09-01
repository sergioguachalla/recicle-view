package com.example.recview.model;

public class Item {
    private String name;
    private String description;
    private int imageResource;

    public Item(String name, String description, int imageResource) {
        this.name = name;
        this.description = description;
        this.imageResource = imageResource;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getImageResource() {
        return imageResource;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}
