package com.eon.Entities;

public class Cuenta {

    private double balance;

    public Cuenta() {
        super();
    }

    public Cuenta(double balance) {
        super();
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean ingresar(double cantidad) {
        balance += cantidad;
        return true;
    }

    public boolean extraer(double cantidad) {

        if ((balance - cantidad) < 0) {
            return false;
        }

        balance -= cantidad;
        return true;
    }
}
