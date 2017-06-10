package com.htcursos.resom.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.htcursos.resom.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ConfirmacaoClienteActivity extends AppCompatActivity{

    @Bind(R.id.textViewNome)
    TextView txtViewNome;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmacao_cliente);
        ButterKnife.bind(this );

        String nome = getIntent().getStringExtra("parametro");
        txtViewNome.setText(nome);
    }
}
