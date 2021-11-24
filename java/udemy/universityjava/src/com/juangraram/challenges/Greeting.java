package com.juangraram.challenges;

//public class Hello {
//    public static void main(String[] args) {
//        String name = "Juan";
//        int age = 28;
//        int num = 10;
//        for(int u = 0; u <= num; u++){
//            System.out.println("Hola este es el number: " + u);
//        }
//        System.out.println("Hola tu nombre es: " + name + " y tu edad es: " + age);
//    }
//}

//class A{
//    void m(){System.out.println("hello m");}
//    void n(){
//        System.out.println("hello n");
////m();//same as this.m()
//          // By default added by the compiler
//    }
//}
//class TestThis4{
//    public static void main(String args[]){
//        A a=new A();
//        a.n();
//    }}

// File Name : ExcepTest.java
import java.io.*;

//class ExcepTest {
//
//    public static void main(String args[]) {
//        try {
//            int a[] = new int[2]; // Size 2
//            System.out.println("Access element three :" + a[3]); // Accessing 3rd element
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception thrown  :" + e);
//        }
//        System.out.println("Out of the block");
//    }
//}

import java.util.*; // All the classes and interfaces are part of the util package
class CollectionsDemo {

    public static void main(String[] args) {
        // ArrayList
        List a1 = new ArrayList();
        a1.add("Zara");
        a1.add("Mahnaz");
        a1.add("Ayan");
        System.out.println(" ArrayList Elements");
        System.out.print("\t" + a1);

        // LinkedList
        List l1 = new LinkedList();
        l1.add("Zara");
        l1.add("Mahnaz");
        l1.add("Ayan");
        System.out.println();
        System.out.println(" LinkedList Elements");
        System.out.print("\t" + l1);

        // HashSet
        Set s1 = new HashSet();
        s1.add("Zara");
        s1.add("Mahnaz");
        s1.add("Ayan");
        System.out.println();
        System.out.println(" Set Elements");
        System.out.print("\t" + s1);

        // HashMap
        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");
        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);
    }
}
