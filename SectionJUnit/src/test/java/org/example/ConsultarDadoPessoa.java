package org.example;

import java.time.LocalDate;

import org.junit.jupiter.api.*;

public class ConsultarDadoPessoa {

    @BeforeAll
    static void configurarConexao(){
        BancoDeDados.iniciarConexao();
    }
    @BeforeEach
    void inserirDadosAntes(){
        BancoDeDados.inserirDados(new Pessoa("Gabriel", LocalDate.of(2003,1,8)));
    }
    @AfterEach
    void removerDados(){
        BancoDeDados.RemoverDados(new Pessoa("Gabriel", LocalDate.of(2003,1,8)));
    }

    @Test
    void validarDadosPessoa(){
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosPessoa2(){
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.fecharConexao();
    }




}
