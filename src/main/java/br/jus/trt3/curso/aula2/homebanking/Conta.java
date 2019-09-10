package br.jus.trt3.curso.aula2.homebanking;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Conta {

    private final Cliente cliente;
    private final Long id;
    private BigDecimal saldo;
    private final List<Movimento> movimentos = new ArrayList<>();
    private Subject<MovimentacaoAlta> emissor = new SubjectImpl<>();

    public Conta(Cliente cliente, Long id, BigDecimal saldo) {
        this.cliente = cliente;
        this.id = id;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public List<Movimento> getMovimentos() {
        return Collections.unmodifiableList(movimentos);
    }

    public void depositar(LocalDateTime data, BigDecimal valor) {
        if (valor.compareTo(BigDecimal.valueOf(0d)) < 0) {
            throw new IllegalArgumentException("O valor deve ser positivo");
        }

        if (valor.compareTo(BigDecimal.valueOf(50000d)) > 0) {
            emissor.notificarTodos(new MovimentacaoAlta(this, data, valor));
        }

        movimentos.add(new Movimento(data, valor));
        this.saldo = saldo.add(valor);
    }

    public void sacar(LocalDateTime data, BigDecimal valor) {
        if (valor.compareTo(BigDecimal.valueOf(0d)) < 0) {
            throw new IllegalArgumentException("O valor deve ser positivo");
        }

        if (valor.compareTo(saldo) > 0) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }

        if (valor.compareTo(BigDecimal.valueOf(1000)) > 0) {
            if (data.getHour() < 6 || data.getHour() >22) {
                throw new IllegalArgumentException("Horário de saque não permitido para valores acima de 1000");
            }
        }

        movimentos.add(new Movimento(data, valor.multiply(BigDecimal.valueOf(-1d))));
        this.saldo = saldo.add(valor.multiply(BigDecimal.valueOf(-1d)));
    }

    public void imprimirExtrato() {
        // TODO: refatorar para uma classe externa daqui a pouco
    }

    public BigDecimal descontarTaxaMensal() {
        return BigDecimal.valueOf(0d);
    }
}