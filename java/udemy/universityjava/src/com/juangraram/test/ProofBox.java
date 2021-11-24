package com.juangraram.test;
import com.juangraram.classobjects.Box;

public class ProofBox {
    public static void main(String[] args) {
        Box boxOne = new Box(5, 6, 7);
        int result = boxOne.vol(5, 6, 2);
        System.out.println("The volume of the box is: " + result);
    }
}
