package org.example;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        LOGGER.info("Iniciando Conexao");
    }

    public static void fecharConexao(){
        LOGGER.info("Fechando Conexao");
    }

    public static void inserirDados(Pessoa pessoa){
        LOGGER.info("Inseriu Dados");
    }
    public static void RemoverDados(Pessoa pessoa){
        LOGGER.info("Removeu Dados");
    }



}
