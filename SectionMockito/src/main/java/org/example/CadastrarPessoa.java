package org.example;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
public class CadastrarPessoa {

    private ApiDosCoreeios ApiDosCoreeios;


    public CadastrarPessoa(final ApiDosCoreeios apiDosCoreeios) {
        ApiDosCoreeios = apiDosCoreeios;
    }

    public Pessoa cadastrarPessoa(String nome, String documento,LocalDate dataNascimento, String cep) {
        Pessoa pessoa = new Pessoa(nome,documento,dataNascimento);
        DadosLocalizado dadosLocalizado = ApiDosCoreeios.buscarDadosCep(cep);
        pessoa.adicionarEndereco(dadosLocalizado);
        return pessoa;
    }

}
