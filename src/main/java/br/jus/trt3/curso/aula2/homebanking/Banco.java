package br.jus.trt3.curso.aula2.homebanking;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {

    private final List<Cliente> clientes = new ArrayList<>();

    private OperacaoTransferencia transferenciaFundosService = new TransferenciaFundosService();

    public Banco() {

    }

    public List<Cliente> getClientes() {
        return Collections.unmodifiableList(this.clientes);
    }

    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void imprimirClientesFormatoPadrao() {
        clientes.stream()
            .forEach(cli -> System.out.println(cli.getNome() + " " + cli.getSobrenome()));
    }

    public void imprimirClientesFormatoAmericano() {
        clientes.stream()
            .forEach(cli -> System.out.println(cli.getSobrenome() + ", " + cli.getNome()));
    }
    
    public void transferirFundos(Conta contaOrigem, Conta contaDestino, LocalDateTime data, BigDecimal valor) {
        transferenciaFundosService.transfereFundos(contaOrigem, contaDestino, data, valor);
    }

    public BigDecimal calcularAplicacaoTotal() {
        return clientes.stream()
            .flatMap(cli -> cli.getContas().stream())
            .map(conta -> conta.getSaldo())
            .reduce(BigDecimal.valueOf(0d), (total, saldo) -> total.add(saldo));
    }
}   
