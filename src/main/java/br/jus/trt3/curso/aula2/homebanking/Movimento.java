package br.jus.trt3.curso.aula2.homebanking;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Movimento {

    private final BigDecimal valor;
    private final LocalDate data;

    public Movimento(LocalDate data, BigDecimal valor) {
        this.valor = valor;
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }
}