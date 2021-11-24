package com.juangraram.foundations;
import java.util.Scanner;

public class ScannerOne {
    public static void main(String[] args) {
        System.out.println("Input the name: ");
        Scanner insert = new Scanner(System.in);
        String name = insert.nextLine();
        System.out.println("The name is: " + name);
    }
}
