package com.example.porteiro.treetorahforest;

import android.content.Intent;
import android.os.Bundle;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

import com.example.porteiro.treetorahforest.database.DadosOpenHelper;
import com.example.porteiro.treetorahforest.entidades.Pessoa;

public class ActListaPessoa extends AppCompatActivity {

     /*private RecyclerView lstDados;
     private SQLiteDatabase conexao;
     private DadosOpenHelper dadosOpenHelper;
     public ConstraintLayout layoutContentLista;*/

     private EditText edt_resultado_nome;
     private ActCadPessoa cadPessoa;
     Pessoa pessoa = new Pessoa();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_lista_pessoa);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        edt_resultado_nome.setText(pessoa.getNome());




        /*lstDados = (RecyclerView)findViewById(R.id.lstDados);
        layoutContentLista = (ConstraintLayout)findViewById(R.id.layoutContentLista);*/

    }
    /*public void criarConexao(){

        try {

            dadosOpenHelper = new DadosOpenHelper(this);

            conexao = dadosOpenHelper.getWritableDatabase();

            Snackbar.make(layoutContentLista, "Conexão criada com sucesso",Snackbar.LENGTH_SHORT).setAction("Ok",null).show();

        }catch(SQLException ex){

            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setTitle("Erro");
            dlg.setMessage(ex.getMessage());
            dlg.setNeutralButton("Ok", null);
            dlg.show();
        }
    }*/

}
