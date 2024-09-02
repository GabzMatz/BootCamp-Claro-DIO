package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;
;

public class CondicionalTeste {


    @Test
    //@EnabledIfEnvironmentVariable(named="USER", matches = "Gabriel")
    //@EnabledOnOs(OS.WINDOWS)
    @EnabledOnOs({OS.WINDOWS, OS.MAC, OS.LINUX})
    @EnabledOnJre(JRE.JAVA_22)
    @EnabledForJreRange(min = JRE.JAVA_22, max = JRE.JAVA_23)
    void validarAlgoSomenteNoUsuarioGabriel(){
        Assertions.assertEquals(10,5+5);

    }

}


