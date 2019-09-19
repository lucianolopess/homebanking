package br.jus.trt3.curso.aula2.homebanking;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {

    private final String nome;
    private final String sobrenome;
    private final String endereco;
    private final String telefone;
    private final List<Conta> contas = new ArrayList<>();

    private Cliente(String nome, String sobrenome, String endereco, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public List<Conta> getContas() {
        return Collections.unmodifiableList(this.contas);
    }

    public void addConta(Conta conta) {
        conta.setCliente(this);
        this.contas.add(conta);
    }

    public BigDecimal calcularAplicacoesTotais() {
        return BigDecimal.valueOf(0d);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {

        private String nome;
        private String sobrenome;
        private String endereco;
        private String telefone;
        private List<Conta> contas = new ArrayList<>();
    
        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder sobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }

        public Builder endereco(String endereco) {
            this.endereco = endereco;
            return this;
        }

        public Builder telefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public Builder addContaCorrente(Long id, BigDecimal saldo, BigDecimal limiteCredito) {
            contas.add(new ContaCorrente(id, saldo, limiteCredito));
            return this;
        }

        public Builder addContaInvestimento(Long id, BigDecimal saldo, TipoAplicacao tipo) {
            contas.add(new ContaInvestimento(id, saldo, tipo));
            return this;
        }

        public Cliente build() {
            Cliente cli = new Cliente(nome, sobrenome, endereco, telefone);
            contas.stream()
                .forEach(c -> cli.addConta(c));
            return cli;
        }
    }
    
}