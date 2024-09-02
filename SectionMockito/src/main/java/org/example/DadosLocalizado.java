package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DadosLocalizado {

    private String uf;
    private String cidade;
    private String bairro;


    public DadosLocalizado(String uf, String cidade, String bairro) {
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
    }
}
