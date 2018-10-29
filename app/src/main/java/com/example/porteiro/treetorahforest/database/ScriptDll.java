package com.example.porteiro.treetorahforest.database;

public class ScriptDll {


    public static String getCreateTablePessoa(){

        StringBuilder sql = new StringBuilder();

        sql.append("CREATE TABLE IF NOT EXISTS CLIENTE (");
        sql.append("CODIGO           INTEGER      PRIMARY KEY AUTOINCREMENT NOT NULL,");
        sql.append("NOME             VARCHAR(250) NOT NULL DEFAULT(''),");
        sql.append("ENDERECO         VARCHAR(255) NOT NULL DEFAULT(''),");
        sql.append("EMAIL            VARCHAR(200) NOT NULL DEFAULT(''),");
        sql.append("TELEFONE         VARCHAR(20)  NOT NULL DEFAULT(''),");
        sql.append("PAIS             VARCHAR(250) NOT NULL DEFAULT(''),");
        sql.append("ESTADO           VARCHAR(250) NOT NULL DEFAULT(''))");
        sql.append("NUM_ARVORE_CORT  INTEGER NOT NULL DEFAULT(''),");
        sql.append("VOLUME_M3        INTEGER NOT NULL DEFAULT(''),");
        sql.append("ARVORES_REPOSTAS INTEGER NOT NULL DEFAULT(''),");
        sql.append("TOTAL            INTEGER NOT NULL DEFAULT(''))");

        return sql.toString();


    }
}
