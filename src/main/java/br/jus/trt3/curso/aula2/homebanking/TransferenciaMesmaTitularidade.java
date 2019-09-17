package br.jus.trt3.curso.aula2.homebanking;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * TransferenciaMesmaTitularidade
 */
public class TransferenciaMesmaTitularidade implements OperacaoTransferencia {

    @Override
    public void transfereFundos(Conta contaOrigem, Conta contaDestino, LocalDateTime data, BigDecimal valor) {
        contaOrigem.sacar(data, valor);
        contaDestino.depositar(data, valor);
    }

}