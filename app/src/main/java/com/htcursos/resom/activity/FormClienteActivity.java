package com.htcursos.resom.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import com.htcursos.resom.R;
import com.htcursos.resom.model.Client;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FormClienteActivity extends AppCompatActivity{

    @Bind(R.id.inputNome)
    EditText inputNome;
    @Bind(R.id.inputEmail)
    EditText inputEmail;
    @Bind(R.id.inputCel)
    EditText inputCel;
    @Bind(R.id.inputCpf)
    EditText inputCpf;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_cliente);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSalvarCliente)
    public void salvarCliente(){

        // Montar o cliente
        Client cli = new Client();
        cli.setName(inputNome.getText().toString());
        cli.setCel(inputCel.getText().toString());
        cli.setCpf(inputCpf.getText().toString());
        cli.setEmail(inputEmail.getText().toString());

        Intent intent = new Intent(FormClienteActivity.this, ConfirmacaoClienteActivity.class);
        intent.putExtra("cliente", cli);
        startActivity(intent);
    }
}
