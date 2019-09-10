package br.jus.trt3.curso.aula2.homebanking;

import java.math.BigDecimal;

public class Conta {

    private final Long id;
    private final BigDecimal saldo;

    public Conta(Long id, BigDecimal saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}