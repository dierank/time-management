package com.example.rank.newnewnew.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.rank.newnewnew.NovaCategoriaActivity;
import com.example.rank.newnewnew.R;

public class CategoriasFragment extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, final Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_categorias, container, false);

        TextView texto = view.findViewById(R.id.texto_categorias);
        texto.setText("Fragment: Categorias");

        FloatingActionButton fab = view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), NovaCategoriaActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
