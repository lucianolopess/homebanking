package br.jus.trt3.curso.aula2.homebanking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {

    private final List<Cliente> clientes = new ArrayList<>();

    public Banco() {

    }

    public List<Cliente> getClientes() {
        return Collections.unmodifiableList(this.clientes);
    }

    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
    
}   
