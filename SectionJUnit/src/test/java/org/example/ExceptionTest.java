package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionTest {


    @Test
    void validarCenarioExcecaoTransferencia(){
        Conta origem = new Conta(789342,3456789);
        Conta dest = new Conta(346211,328981);

        TransferenciaEntreConta transf = new TransferenciaEntreConta();

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                transf.tranfere(origem,dest,-1));

    }

}
