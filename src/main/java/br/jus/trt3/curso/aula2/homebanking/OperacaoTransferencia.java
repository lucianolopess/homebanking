package br.jus.trt3.curso.aula2.homebanking;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface OperacaoTransferencia {

    void transfereFundos(Conta contaOrigem, Conta contaDestino, LocalDateTime data, BigDecimal valor);
}