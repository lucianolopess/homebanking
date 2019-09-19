package br.jus.trt3.curso.aula2.homebanking;

import java.math.BigDecimal;

public final class App {

    private App() {
    }

    public static void main(String[] args) {
        
        Banco meuBanco = new Banco();

        // criar Clientes

        Cliente cliente1 = Cliente.newBuilder()
            .nome("Cliente 1")
            .sobrenome("Sobrenome 1")
            .endereco("Endereco 1")
            .telefone("Telefone 1")
            .addContaCorrente(Long.valueOf(1L), new BigDecimal("1000"), new BigDecimal("2000"))
            .addContaInvestimento(Long.valueOf(1L), new BigDecimal("1000"), TipoAplicacao.UM)
            .addContaInvestimento(Long.valueOf(2L), new BigDecimal("1000"), TipoAplicacao.DOIS)
            .addContaInvestimento(Long.valueOf(3L), new BigDecimal("1000"), TipoAplicacao.TRES)
            .build();

        Cliente cliente2 = Cliente.newBuilder()
            .nome("Cliente 2")
            .sobrenome("Sobrenome 2")
            .endereco("Endereco 2")
            .telefone("Telefone 2")
            .addContaCorrente(Long.valueOf(4L), new BigDecimal("2000"), new BigDecimal("3000"))
            .addContaInvestimento(Long.valueOf(5L), new BigDecimal("4000"), TipoAplicacao.UM)
            .addContaInvestimento(Long.valueOf(6L), new BigDecimal("4000"), TipoAplicacao.DOIS)
            .addContaInvestimento(Long.valueOf(7L), new BigDecimal("4000"), TipoAplicacao.TRES)
            .build();

        meuBanco.addCliente(cliente1);
        meuBanco.addCliente(cliente2);

        // criar movimentos

        // imprimir extrato

        // transferir contas

        // imprimir extrato

        // imprimir ...

    }
}
