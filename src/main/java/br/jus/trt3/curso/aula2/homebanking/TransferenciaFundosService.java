package br.jus.trt3.curso.aula2.homebanking;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransferenciaFundosService implements OperacaoTransferencia {

    public void transfereFundos(Conta contaOrigem, Conta contaDestino, LocalDateTime data, BigDecimal valor) {
        if (contaOrigem.getCliente().getNome().equals(contaDestino.getCliente().getNome())) {
            new TransferenciaMesmaTitularidade().transfereFundos(contaOrigem, contaDestino, data, valor);
        } else {
            new TransferenciaOutraTitularidade().transfereFundos(contaOrigem, contaDestino, data, valor);
        }
    }
}