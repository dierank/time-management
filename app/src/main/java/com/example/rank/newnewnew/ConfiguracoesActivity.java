package com.example.rank.newnewnew;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ConfiguracoesActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracoes);
    }


    public void apiTest(View view)
    {
        Intent intent = new Intent(this, APIActivity.class);
        startActivity(intent);
    }
}