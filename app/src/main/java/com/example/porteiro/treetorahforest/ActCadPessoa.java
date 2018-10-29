package com.example.porteiro.treetorahforest;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;


public class ActCadPessoa extends AppCompatActivity {

    public EditText edt_nome;
    private EditText edt_endereco;
    private EditText edt_email;
    private EditText edt_telefone;
    private EditText edt_pais;
    private EditText edt_estado;
    private EditText edt_num_arvores_cort;
    private EditText edt_volume_m;
    private EditText edt_arvores_repostas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_cad_pessoa);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        edt_nome     = (EditText)findViewById(R.id.edt_nome);
        edt_endereco = (EditText)findViewById(R.id.edt_endereco);
        edt_email    = (EditText)findViewById(R.id.edt_email);
        edt_telefone = (EditText)findViewById(R.id.edt_telefone);
        edt_pais     = (EditText)findViewById(R.id.edt_pais);
        edt_estado   = (EditText)findViewById(R.id.edt_estado);
        edt_num_arvores_cort = (EditText)findViewById(R.id.edt_num_arvores_cort);
        edt_volume_m = (EditText)findViewById(R.id.edt_volume_m);
        edt_arvores_repostas = (EditText)findViewById(R.id.edt_arvores_repostas);

    }

    public void validaCampos(){

        boolean res = false;

        String nome = edt_nome.getText().toString();   // para retornar um valor do edit, tem que fazer o getText
        String endereco = edt_endereco.getText().toString();
        String email = edt_email.getText().toString();
        String telefone = edt_telefone.getText().toString();
        String pais = edt_pais.getText().toString();
        String estado = edt_estado.getText().toString();
        String num_arvores_cort = edt_num_arvores_cort.getText().toString();
        String volume_m = edt_volume_m.getText().toString();
        String arvores_repostas = edt_arvores_repostas.getText().toString();

        if (res = isCampoVazio(nome)){
            edt_nome.requestFocus();

        } else if(res = isCampoVazio(endereco)){
            edt_endereco.requestFocus();

        }else if(res = !isEmailValido(email)){
            edt_email.requestFocus();

        }else if(res = isCampoVazio(telefone)){
            edt_telefone.requestFocus();

        }else if(res = isCampoVazio(pais)){
            edt_pais.requestFocus();

        }else if(res = isCampoVazio(estado)){
            edt_estado.requestFocus();

        }else if(res = isCampoVazio(num_arvores_cort)){
            edt_num_arvores_cort.requestFocus();

        }else if(res = isCampoVazio(volume_m)){
            edt_volume_m.requestFocus();

        }else if(res = isCampoVazio(arvores_repostas)){
            edt_arvores_repostas.requestFocus();

        }

        if (res){
                AlertDialog.Builder dlg = new AlertDialog.Builder(this);
                dlg.setTitle("Aviso");
                dlg.setMessage("Há campos inválidos!");
                dlg.setNeutralButton("Ok", null);
                dlg.show();
        } else{
            double area = 3.14159;
            double calc1 = Double.parseDouble(edt_num_arvores_cort.getText().toString());
            double calc2 = Double.parseDouble(edt_volume_m.getText().toString());
            double calc3 = Double.parseDouble(edt_arvores_repostas.getText().toString());
            calc1 = calc1 * 3.00;
            calc2 = area * calc2;
            calc3 = calc3 * 0.75;
            double total  = (((calc2 / 2) + calc1) - calc3);

            AlertDialog.Builder dlg = new AlertDialog.Builder(this);

            dlg.setTitle("Cadastrado!");
            dlg.setMessage(" Nome: " + edt_nome.getText() +
                    "\n"+" Endereço : " + edt_endereco.getText() +
                    "\n"+" Telefone : " + edt_telefone.getText() +
                    "\n"+" Email : " + edt_email.getText() +
                    "\n"+" País : " + edt_pais.getText()+
                    "\n"+" Estado: " + edt_estado.getText()+
                    "\n"+" Núm. Arv. Cort. : " + edt_num_arvores_cort.getText() +
                    "\n"+" Volume m³ : " + edt_volume_m.getText() +
                    "\n"+" Arvores repostas : " + edt_arvores_repostas.getText() +
                    "\n"+" total : R$" + Math.round(total));
            dlg.setNeutralButton("Ok", null);
            dlg.show();

        }
    }

    private boolean isCampoVazio(String valor){

        boolean resultado = (TextUtils.isEmpty(valor) || valor.trim().isEmpty());
        return resultado;
    }

    private boolean isEmailValido(String email){

        boolean resultado = (!isCampoVazio(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
        return resultado;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_act_cad_pessoa, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        
        switch (id){
            
            case R.id.action_cadastrar :
                validaCampos();
                break;

            case R.id.action_cancelar :
                finish();
                break;

            case R.id.action_infor:
                mostrarInfo2();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void mostrarInfo2(){
        AlertDialog.Builder dlg = new AlertDialog.Builder(this);
        dlg.setTitle("Informação");
        dlg.setMessage("O valor-árvore atualmente em vigor para recolhimento dos consumidores às " +
                "Associações é de R$ 0,75 por árvore (Portaria DEPRN nº 3, de 18 de janeiro de 2006).\n" +
                "A cada 1 metro cúbico extraído de toras, devemos repor 6 árvores. Ou seja, a " +
                "cada 1m³ " +
                ", ou paga-se R$0,75 ou planta-se 6 árvores novas.");
        dlg.setNeutralButton("Ok", null);
        dlg.show();
    }
}
