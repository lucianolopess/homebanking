package br.jus.trt3.curso.aula2.homebanking;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class MovimentacaoAlta {

    private final Conta conta;
    private final LocalDateTime data;
    private final BigDecimal valor;

    public MovimentacaoAlta(Conta conta, LocalDateTime data, BigDecimal valor) {
        this.conta = conta;
        this.data = data;
        this.valor = valor;
    }

    public Conta getConta() {
        return conta;
    }

    public LocalDateTime getData() {
        return data;
    }

    public BigDecimal getValor() {
        return valor;
    }
}