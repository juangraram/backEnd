package com.juangraram.classobjects;


public class Box {
    public int widht;
    public int deep;
    public int heigth;

    public Box(int widht, int deep, int heigth){
        this.widht = widht;
        this.deep = deep;
        this.heigth = heigth;
    }

    public int vol(int widht, int heigth, int deep){
        int volumen = (widht * heigth) * deep;
        return volumen;
    }
}
