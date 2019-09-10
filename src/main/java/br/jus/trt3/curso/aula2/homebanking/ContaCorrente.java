package br.jus.trt3.curso.aula2.homebanking;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {

    private final BigDecimal limiteCredito;

    public ContaCorrente(Cliente cliente, Long id, BigDecimal saldo, BigDecimal limiteCredito) {
        super(cliente, id, saldo);
        this.limiteCredito = limiteCredito;
    }

    public BigDecimal getLimiteCredito() {
        return limiteCredito;
    }

    @Override
    public BigDecimal descontarTaxaMensal() {
        return BigDecimal.valueOf(1d);
    }
}