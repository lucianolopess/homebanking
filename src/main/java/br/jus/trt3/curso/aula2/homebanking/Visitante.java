package br.jus.trt3.curso.aula2.homebanking;

/**
 * Visitante
 */
public interface Visitante {

    void visitar(ContaCorrente conta);
    void visitar(ContaInvestimento conta);
    
}