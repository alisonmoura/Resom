package com.htcursos.resom.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.htcursos.resom.R;
import com.htcursos.resom.adapter.ListaClienteAdapter;
import com.htcursos.resom.model.Client;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ListaClienteActivity extends AppCompatActivity{

    @Bind(R.id.listaCliente)
    ListView listaCliente;

    List<Client> clientes = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_cliente);
        ButterKnife.bind(this);

        Client jao = new Client();
        jao.setName("Jão da Silva");
        jao.setEmail("jao@gmail.com");
        jao.setImage(R.mipmap.ic_launcher);

        Client maria = new Client();
        maria.setName("Maria da Silva");
        maria.setEmail("maria@gmail.com");
        maria.setImage(R.mipmap.ic_launcher);

        Client ze = new Client();
        ze.setName("Zé da Silva");
        ze.setEmail("ze@gmail.com");
        ze.setImage(R.mipmap.ic_launcher);

        clientes.add(jao);
        clientes.add(maria);
        clientes.add(ze);

        ListaClienteAdapter adapter = new ListaClienteAdapter(this, clientes);

        listaCliente.setAdapter(adapter);
    }
}
