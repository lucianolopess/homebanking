package br.jus.trt3.curso.aula2.homebanking;

import java.math.BigDecimal;

public class ContaInvestimento extends Conta {

    private final TipoAplicacao tipoAplicacao;

    public ContaInvestimento(Cliente cliente, Long id, BigDecimal saldo, TipoAplicacao tipoAplicacao) {
        super(cliente, id, saldo);
        this.tipoAplicacao = tipoAplicacao;
    }

    public TipoAplicacao getTipoAplicacao() {
        return tipoAplicacao;
    }

    @Override
    public BigDecimal descontarTaxaMensal() {
        return getSaldo().multiply(BigDecimal.valueOf(0.01 / 100));
    }
}