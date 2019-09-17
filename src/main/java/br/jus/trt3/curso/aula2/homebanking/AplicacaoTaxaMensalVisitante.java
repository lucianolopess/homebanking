package br.jus.trt3.curso.aula2.homebanking;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class AplicacaoTaxaMensalVisitante implements Visitante {

    private BigDecimal taxaContaCorrente;
    private BigDecimal taxaContaInvestimento;

    public AplicacaoTaxaMensalVisitante(BigDecimal taxaContaCorrente, BigDecimal taxaContaInvestimento) {
        this.taxaContaCorrente = taxaContaCorrente;
        this.taxaContaInvestimento = taxaContaInvestimento;
    }

    @Override
    public void visitar(ContaCorrente conta) {
        conta.sacar(LocalDateTime.now().withDayOfMonth(1), taxaContaCorrente);
    }

    @Override
    public void visitar(ContaInvestimento conta) {
        BigDecimal taxa = conta.getSaldo().multiply(taxaContaInvestimento.divide(BigDecimal.valueOf(100d)));
        conta.sacar(LocalDateTime.now().withDayOfMonth(1), taxa);
    }

}