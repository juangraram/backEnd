package com.juangraram.encapsulation;

public class Persona {
    private String name;
    private String lastname;
    private double pay;
    private boolean deleted;

    public Persona(String name, String lastname, double pay, boolean deleted){
        this.name = name;
        this.lastname = lastname;
        this.pay = pay;
        this.deleted = deleted;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getPay() {
        return this.pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", pay=" + pay +
                ", deleted=" + deleted +
                '}';
    }
}
