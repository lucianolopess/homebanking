package br.jus.trt3.curso.aula2.homebanking;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Conta {

    private final Long id;
    private final BigDecimal saldo;
    private final List<Movimento> movimentos = new ArrayList<>();

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

    public List<Movimento> getMovimentos() {
        return Collections.unmodifiableList(movimentos);
    }
}