package com.example.qing.first;

public class Fruit {
    private String name;
    private int imageId;
    public Fruit(String name,int imageId){
        this.imageId=imageId;
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}
