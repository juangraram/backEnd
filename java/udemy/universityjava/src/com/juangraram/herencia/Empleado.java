package com.juangraram.herencia;

public class Empleado extends Persona {
    private int idEmpleado;
    private double salario;
    private static int count;

    public Empleado(String name, double salario) {
        super(name);
        this.idEmpleado = ++ Empleado.count;
        this.salario = salario;
    }

    // Getter and setter
    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("idEmpleado=").append(idEmpleado);
        sb.append(", salario=").append(salario);
        sb.append(", name=").append(name);
        sb.append(", Persona=").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
