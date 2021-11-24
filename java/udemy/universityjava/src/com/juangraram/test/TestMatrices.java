package com.juangraram.test;

import com.juangraram.matrices.Persona;

import java.awt.event.PaintEvent;

public class TestMatrices {
    public static void main(String[] args) {
        int ages[][] = new int[3][2];
        System.out.println(ages);

        ages[0][0] = 5;
        ages[0][1] = 3;
        ages[1][0] = 9;
        ages[1][1] = 2;

        System.out.println("Ages: " + ages[0][1]);

        for (int row = 0; row < ages.length; row ++){
            for (int column = 0; column < ages[row].length; column ++){
                System.out.println("Row: " +  row + " Column: " + column + " Values: " + ages[row][column]);
            }
        }

        //String fruits[][] = new String[3][2];
        String fruits[][] = {{"Orange", "Lemon"},  {"Guava","Apple"}, {"Banana", "Strawberry"}};

//        for (int rowfruits = 0; rowfruits < fruits.length; rowfruits ++){
//            for (int colfruits = 0; colfruits < fruits[rowfruits].length; colfruits ++){
//                System.out.println("Row: " + rowfruits + " Column: " + colfruits + " Value: " + fruits[rowfruits][colfruits]);
//            }
//        }

        print(fruits);

        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        personas[0][2] = new Persona("Diego");

        print(personas);
    }

    public static void print(Object matriz[][]){
        for (int rowfruits = 0; rowfruits < matriz.length; rowfruits ++){
            for (int colfruits = 0; colfruits < matriz[rowfruits].length; colfruits ++){
                System.out.println("Row: " + rowfruits + " Column: " + colfruits + " Value: " + matriz[rowfruits][colfruits]);
            }
        }
    }
}
