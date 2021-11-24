package com.juangraram.contextstatic;

public class Persona {
    private int idPersona;
    private String name;
    private static int countObject;

    public Persona(String name) {
        this.name = name;
        Persona.countObject++;
        this.idPersona = Persona.countObject;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCountObject() {
        return countObject;
    }

    public static void setCountObject(int countObject) {
        Persona.countObject = countObject;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idPersona=" + idPersona +
                ", name='" + name + '\'' +
                '}';
    }
}
