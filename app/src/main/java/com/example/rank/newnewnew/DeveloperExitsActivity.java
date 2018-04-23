package com.example.rank.newnewnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DeveloperExitsActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer_exits);
    }

    public void listaActivity(View view)
    {
        Intent intent = new Intent(this, ListaActivity.class);
        startActivity(intent);
    }
    public void startLogin(View view)
    {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    public void startHistorico(View view)
    {
        Intent intent = new Intent(this, ListaActivity.class);
        startActivity(intent);
    }
    public void startNovaAtividade(View view)
    {
        Intent intent = new Intent(this, NovaAtividadeActivity.class);
        startActivity(intent);
    }
    public void startPrincipal(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
