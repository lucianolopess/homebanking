package br.jus.trt3.curso.aula2.homebanking;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl<T> implements Subject<T> {

    private final List<Observer<T>> observadores = new ArrayList<>();

    public void addObserver(Observer<T> observer) {
        observadores.add(observer);
    }

    public void notificarTodos(T valor) {
        observadores.stream()
            .forEach(o -> o.observe(valor));
    }
}