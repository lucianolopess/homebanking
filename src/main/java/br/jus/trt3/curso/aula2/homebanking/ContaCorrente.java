package br.jus.trt3.curso.aula2.homebanking;

import java.math.BigDecimal;

public class ContaCorrente extends Conta {

    private final BigDecimal limiteCredito;

    public ContaCorrente(Long id, BigDecimal saldo, BigDecimal limiteCredito) {
        super(id, saldo);
        this.limiteCredito = limiteCredito;
    }

    public BigDecimal getLimiteCredito() {
        return limiteCredito;
    }

    @Override
    public BigDecimal descontarTaxaMensal() {
        return BigDecimal.valueOf(1d);
    }

    @Override
    public void aceitarVisitante(Visitante visitante) {
        visitante.visitar(this);
    }
}