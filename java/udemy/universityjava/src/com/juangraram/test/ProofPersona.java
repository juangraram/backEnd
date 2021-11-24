package com.juangraram.test;
import com.juangraram.classobjects.Persona;

public class ProofPersona {
    public static void main(String[] args) {
        Persona personOne = new Persona();
        personOne.name = "Juan";
        personOne.lastName = "Granada";
        personOne.age = 33;
        personOne.showInformation();
    }
}
