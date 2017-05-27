package com.htcursos.resom;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity{

    @Bind(R.id.titulo)
    TextView titulo;
    @Bind(R.id.btn_start)
    Button btnStart;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_start)
    public void click(){
        titulo.setText("Olá Mundo!");
    }
}
