package com.juangraram.test;

public class TestArray {
    public static void main(String[] args) {
        int ages[] = new int[3];
        System.out.println(ages);

        ages[0] =  2;
//        System.out.println(ages[0]);

//        ages[3] = 5;
//        System.out.println(ages[3]);

        for (int i = 0; i < ages.length; i++){
            System.out.println("Position: " + i + " Valor: " + ages[i]);
        }

        String fruits[] = {"Orange", "Lemon", "Guava"};
        System.out.println(fruits[1]);
        for (int i = 0; i < fruits.length; i++){
            System.out.println("Position: " + i + " Value:" + fruits[i]);
        }
    }
}
