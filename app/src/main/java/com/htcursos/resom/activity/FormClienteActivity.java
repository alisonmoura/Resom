package com.htcursos.resom.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.htcursos.resom.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class FormClienteActivity extends AppCompatActivity{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_cliente);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSalvarCliente)
    public void salvarCliente(){
        Intent intent = new Intent(FormClienteActivity.this, ConfirmacaoClienteActivity.class);
        intent.putExtra("parametro", "Jão da Silva");
        startActivity(intent);
    }
}
