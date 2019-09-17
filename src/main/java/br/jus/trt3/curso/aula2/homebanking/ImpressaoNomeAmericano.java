package br.jus.trt3.curso.aula2.homebanking;

/**
 * ClienteNomeAmericano
 */
public class ImpressaoNomeAmericano {

    private Cliente cliente;

    public ImpressaoNomeAmericano(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return cliente.getSobrenome() + ", " + cliente.getNome();
    }

    
}