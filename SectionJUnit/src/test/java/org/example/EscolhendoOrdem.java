package org.example;

import org.junit.jupiter.api.*;


//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class EscolhendoOrdem {
    
    @DisplayName("A")
    @Order(4)
    @Test
    public void fluxoC() {
        Assertions.assertTrue(true);
    }
    @DisplayName("B")
    @Order(1)
    @Test
    public void fluxoB() {
        Assertions.assertTrue(true);
    }
    @DisplayName("D")
    @Order(2)
    @Test
    public void fluxoA() {
        Assertions.assertTrue(true);
    }
    @DisplayName("C")
    @Order(3)
    @Test
    public void fluxoD() {
        Assertions.assertTrue(true);
    }

}
