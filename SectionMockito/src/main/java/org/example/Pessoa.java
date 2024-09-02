package org.example;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class Pessoa {
    private String nome;
    private String documento;
    private String cep;
    private LocalDate dataNascimento;
    private DadosLocalizado nascimento;


    public Pessoa(String nome, String documento, LocalDate dataNascimento) {
        this.nome = nome;
        this.documento = documento;
        this.dataNascimento = dataNascimento;
    }


    public void adicionarEndereco(DadosLocalizado dadosLocalizado) {
        this.nascimento = dadosLocalizado;
    }
}
