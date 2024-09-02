package org.example;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    @Getter
    private String nome;
    private LocalDate dataNascimento;


    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return (int) ChronoUnit.YEARS.between(this.dataNascimento, LocalDate.now());
    }

    public boolean ehMaior(){
        return getIdade() >= 18;
    }

}
