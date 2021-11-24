package com.juangraram.test;
import com.juangraram.classobjects.Arithmetic;

public class ProofArithmetic {
    public static void main(String[] args) {
        Arithmetic arithmeticOne = new Arithmetic();
        arithmeticOne.numOne = 5;
        arithmeticOne.numTwo = 2;

        int result = arithmeticOne.addWithReturn();
        System.out.println("The result is: " + result);

        int result1 = arithmeticOne.addWithArguments(8, 7);
        System.out.println("La suma es " + result1);
    }
}
