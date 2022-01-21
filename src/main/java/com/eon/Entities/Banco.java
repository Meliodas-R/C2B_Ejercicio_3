package com.eon.Entities;

public class Banco {

    private Cliente[] clientes = new Cliente[4];
    private int numeroClientes = 0;

    public Banco() {
        super();
    }

    public void agregarCliente(String nombre, String apellido) {
        clientes[numeroClientes] = new Cliente(nombre, apellido);
        numeroClientes++;
    }

    /**
     * Borra un cliente del array de clientes.
     *
     * @param posicion
     */
    public void borrarCliente(int posicion) {

        // Comprueba si el array está vacío o el índice está fuera de los límites.
        if (clientes == null || posicion == 0 || posicion > clientes.length) {
            System.out.println("No se pudo eliminar el elemento indicado.");
        } else {
            // Crea un nuevo array que contendrá los elementos del anterior array sin el elemento borrado.
            Cliente[] arrayActualizado = new Cliente[clientes.length - 1];

            // Copia los elementos del ara original al nuevo array desde el inicio hasta el indice indicado.
            System.arraycopy(clientes, 0, arrayActualizado, 0, posicion);

            // Copia los elementos del arra original al nuevo array desde el indice+1 hasta el final del arraycopy.
            System.arraycopy(clientes, posicion + 1, arrayActualizado, posicion, clientes.length - posicion - 1);

            numeroClientes--;
            clientes = arrayActualizado;

        }

    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public int getNumeroClientes() {
        return numeroClientes;
    }

}
