package br.jus.trt3.curso.aula2.homebanking;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * CalculoRentabilidadeService
 */
public class CalculoRentabilidadeService implements CalculoRentabilidade {

    private static Map<TipoAplicacao, CalculoRentabilidade> map = new HashMap<>();

    static {
        map.put(TipoAplicacao.UM, new CalculoRentabilidadeTipoAplicacaoUm(new BigDecimal("0.05")));
        map.put(TipoAplicacao.DOIS, new CalculoRentabilidadeTipoAplicacaoDois(new BigDecimal("0.10")));
        map.put(TipoAplicacao.TRES, new CalculoRentabilidadeTipoAplicacaoTres(new BigDecimal("0.15")));
    }

    @Override
    public void calcularRentatabilidade(ContaInvestimento contaInvestimento) {
        map.get(contaInvestimento.getTipoAplicacao()).calcularRentatabilidade(contaInvestimento);
    }

}