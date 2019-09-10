package br.jus.trt3.curso.aula2.homebanking;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {

    private final String nome;
    private final String sobrenome;
    private final String endereco;
    private final String telefone;
    private final List<Conta> contas = new ArrayList<>();

    public Cliente(String nome, String sobrenome, String endereco, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public List<Conta> getContas() {
        return Collections.unmodifiableList(contas);
    }

    public void addConta(Conta conta) {
        contas.add(conta);
    }

    public BigDecimal calcularAplicacoesTotais() {
        return BigDecimal.valueOf(0d);
    }

    public void transferirFundos(Conta contaOrigem, Conta contaDestino, LocalDate data, BigDecimal valor) {
        // Lançar movimento de saída na conta de origem e entrada na conta de destino
    }
}