package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    public void testeIdadeCorretamente(){
        Pessoa gabriel = new Pessoa("Gabriel", LocalDate.of(2003,1,1));
        Assertions.assertEquals(21, gabriel.getIdade());

    }
    @Test
    public void deveRetornarMaiorIdade(){
        Pessoa gabriel = new Pessoa("Gabriel", LocalDate.of(2003,1,1));
        Assertions.assertTrue(gabriel.ehMaior());

        Pessoa joao = new Pessoa("Joao", LocalDate.of(2007,1,1));
        Assertions.assertFalse(joao.ehMaior());


        
    }

}
