package com.juangraram.classobjects;

public class Arithmetic {
    // Attributes
    public int numOne;
    public int numTwo;

    // Constructor empty
    public Arithmetic() {
        System.out.println("Constructor empty");
    }

    // Constructor with arguments
    public Arithmetic(int numOne, int numTwo){
        this.numOne = numOne;
        this.numTwo = numTwo;
    }


    // Methods
    public void add(){
        int total = numOne + numTwo;
        System.out.println("The total is: " + total);
    }

    public int addWithReturn(){
        return numOne + numTwo;
    }

    public int addWithArguments(int numOne, int numTwo){
        this.numOne = numOne;
        this.numTwo = numTwo;
        return numOne + numTwo;
    }
}
