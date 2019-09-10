package br.jus.trt3.curso.aula2.homebanking;

public class Coaf {

    private Coaf instance;

    public Coaf getInstance() {
        if (instance == null) {
            instance = new Coaf();
        }
        return instance;
    }

    
}