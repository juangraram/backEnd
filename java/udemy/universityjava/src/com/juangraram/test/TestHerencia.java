package com.juangraram.test;

import com.juangraram.herencia.*;

import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        //Empleado empOne = new Empleado("Juan", 500.00);
        //Empleado empTwo = new Empleado("Diego", 700.0);
        Cliente cliOne = new Cliente(new Date(), true, "Karlos", 'F', 28, "Saturno 15");
        System.out.println(cliOne );
    }
}
