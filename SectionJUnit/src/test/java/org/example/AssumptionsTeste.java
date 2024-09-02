package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;;

public class AssumptionsTeste {


    @Test
    void validarAlgoSomenteNoUsuarioGabriel(){
        Assumptions.assumeTrue("gabriel".equals(System.getenv("gabriel")));
        Assertions.assertEquals(10,5+5);

    }

}
