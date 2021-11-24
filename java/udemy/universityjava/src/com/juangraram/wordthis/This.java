package com.juangraram.wordthis;

public class This {
    public static void main(String[] args) {
        Person persona = new Person("juan", "granada");
        System.out.println(persona);
        System.out.println("Name complete: " + persona.name + " " + persona.lastname);
    }
}

class Person {
    String name;
    String lastname;

    Person(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }
}
