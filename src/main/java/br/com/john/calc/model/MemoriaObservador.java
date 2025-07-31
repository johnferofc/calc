package br.com.john.calc.model;

@FunctionalInterface
public interface MemoriaObservador {
    public void valorAlterado(String novoValor);
}
