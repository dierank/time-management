package com.example.rank.newnewnew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.rank.newnewnew.model.Atividade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        List<Atividade> atividades = putAtividades();

        ListView lista = findViewById(R.id.listaL);

        ArrayAdapter<Atividade> adapter = new ArrayAdapter<Atividade>(this, R.layout.activity_lista);

        lista.setAdapter(adapter);
    }

    private List<Atividade> putAtividades ()
    {
        return new ArrayList<>(Arrays.asList(
           new Atividade("Aula 1: Desenvolvimento Mobile", "Hoje: REST"),
           new Atividade("Fazer APS", "Pesquisa Operacional")
        ));
    }
}