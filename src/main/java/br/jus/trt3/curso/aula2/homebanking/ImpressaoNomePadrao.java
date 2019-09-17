package br.jus.trt3.curso.aula2.homebanking;

/**
 * ClienteNomeAmericano
 */
public class ImpressaoNomePadrao {

    private Cliente cliente;

    public ImpressaoNomePadrao(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return cliente.getNome() + " " + cliente.getSobrenome();
    }

    
}