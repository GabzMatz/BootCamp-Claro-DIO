package org.example;

public class TransferenciaEntreConta {

    public void tranfere(Conta contaOrigem, Conta contaDestion, int valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valor precisaser maior do que 0");
        }
    }

}
