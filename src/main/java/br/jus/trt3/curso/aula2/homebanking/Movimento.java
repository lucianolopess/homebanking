package br.jus.trt3.curso.aula2.homebanking;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Movimento {

    private final BigDecimal valor;
    private final LocalDateTime data;

    public Movimento(LocalDateTime data, BigDecimal valor) {
        this.valor = valor;
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getData() {
        return data;
    }
}