package br.jus.trt3.curso.aula2.homebanking;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * TransferenciaOutraTitularidade
 */
public class TransferenciaOutraTitularidade implements OperacaoTransferencia {

    private BigDecimal taxa = new BigDecimal("1");

    @Override
    public void transfereFundos(Conta contaOrigem, Conta contaDestino, LocalDateTime data, BigDecimal valor) {
        if (contaOrigem.getSaldo().compareTo(valor.add(taxa)) < 0) {
            throw new IllegalArgumentException("Saldo insuficiente para a transferência");
        }
        contaOrigem.sacar(data, valor.add(taxa));
        contaDestino.depositar(data, valor);
    }

}