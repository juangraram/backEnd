package com.juangraram.test;

import com.juangraram.arrays.Persona;

public class TestArrayObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[3];

        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Karla");
        personas[2] = new Persona("Jackie");

//        System.out.println(personas[0]);
//        System.out.println(personas[1]);
//        System.out.println(personas[2]);

        for (int i = 0; i < personas.length; i++){
            System.out.println("Position: " + i + " Value:" + personas[i]);
        }

    }
}
