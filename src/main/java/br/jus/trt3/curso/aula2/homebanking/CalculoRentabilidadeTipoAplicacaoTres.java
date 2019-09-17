package br.jus.trt3.curso.aula2.homebanking;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * CalculoRentabilidadeTipoAplicacaoTres
 */
public class CalculoRentabilidadeTipoAplicacaoTres implements CalculoRentabilidade {

    private BigDecimal taxaDeRentabilidade;

    public CalculoRentabilidadeTipoAplicacaoTres(BigDecimal taxaDeRentabilidade) {
        this.taxaDeRentabilidade = taxaDeRentabilidade;
    }

    @Override
    public void calcularRentatabilidade(ContaInvestimento contaInvestimento) {
        BigDecimal rendimento = contaInvestimento.getSaldo()
                .multiply(taxaDeRentabilidade.add(BigDecimal.valueOf(1d)));
        contaInvestimento.depositar(LocalDateTime.now(), rendimento);
    }

}