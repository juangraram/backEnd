package com.juangraram.test;
import com.juangraram.encapsulation.Persona;

public class TestPersona {
    public static void main(String[] args) {
        Persona personOne = new Persona("Juan", "Granada", 500.00, false);
        System.out.println("Person One: " + personOne.toString());
    }
}
