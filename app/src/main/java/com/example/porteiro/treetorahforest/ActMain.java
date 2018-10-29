package com.example.porteiro.treetorahforest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class ActMain extends AppCompatActivity {

      private EditText edt_login;
      private EditText edt_senha_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);
        informacaoapp();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar); //Toolbar, é a barra do título do APP
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        edt_login = (EditText)findViewById(R.id.edt_login);
        edt_senha_login = (EditText)findViewById(R.id.edt_senha_login);
    }

    public void cadastrar(View view){

        boolean res = false;

        String login = edt_login.getText().toString();
        String senha = edt_senha_login.getText().toString();

        if (login.equals("Usuario") && senha.equals("123456")){

            Intent it = new Intent(ActMain.this, ActCadPessoa.class);
            startActivity(it);

        } else if(res = isCampoVazioLogin(login)){

            edt_login.requestFocus();


        }else if(res = isCampoVazioLogin(senha)){
            edt_senha_login.requestFocus();

        }

        if (res){
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setTitle("Aviso");
            dlg.setMessage("Há campos inválidos!");
            dlg.setNeutralButton("Ok", null);
            dlg.show();
        }
    }

    private boolean isCampoVazioLogin(String valor){

        boolean resultado = (TextUtils.isEmpty(valor) || valor.trim().isEmpty());
        return resultado;

    }

    public void mostrarInfo(View view){
        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setTitle("Sobre");
        dlg.setMessage("Desenvolvido por : \n" +
                "  Kauai Guarilha Freitas");
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }

    public void informacaoapp(){
        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setTitle("Informação");
        dlg.setMessage("Sistema Desenvolvido para calcular a multa que incide sobre o desmatamento de árvores." +
                "\nTodas as regras aplicadas de acordo com : \n(Portaria DEPRN nº 3, de 18 de janeiro de 2006)"+
                "\n"+"\n Login : Usuario"+
                "\n Senha : 123456");
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }
}
