package br.jus.trt3.curso.aula2.homebanking;

public class Coaf implements Observer<MovimentacaoAlta> {

    private Coaf instance;

    public Coaf getInstance() {
        if (instance == null) {
            instance = new Coaf();
        }
        return instance;
    }

    @Override
    public void observe(MovimentacaoAlta valor) {
        
    }

    
}