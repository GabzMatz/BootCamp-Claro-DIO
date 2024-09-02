package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AssetionTest {

    @Test
    void validarLancamento(){

        int[] vetor1 = {1,2,3,4,5,6};
        int[] vetor2 = {1,2,3,4,5,6};


        Assertions.assertArrayEquals(vetor1,vetor2);

    }


    @Test
    public void obgNUll(){

        Pessoa pessoa = null;


        Assertions.assertNull(pessoa);

    }
}
