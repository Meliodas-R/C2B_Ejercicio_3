package com.eon.PL;

import com.eon.Entities.Banco;

public class Principal {

    public static void main(String[] args) {

        Banco banco = new Banco();

        banco.agregarCliente("Jane", "Simms");
        banco.agregarCliente("Owen", "Bryant");
        banco.agregarCliente("Tim", "Soley");
        banco.agregarCliente("Maria", "Soley");

        System.out.println(banco.getNumeroClientes());

        for (int i = 0; i < banco.getNumeroClientes(); i++) {
            System.out.println("El cliente " + i + " es: " + banco.getClientes()[i].toString());
        }

        banco.borrarCliente(2);

        for (int i = 0; i < banco.getNumeroClientes(); i++) {
            System.out.println("El cliente " + i + " es: " + banco.getClientes()[i].toString());
        }

    }
}
