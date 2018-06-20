package com.example.rank.newnewnew.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.rank.newnewnew.R;

public class EstatisticasFragment extends Fragment
{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_estatisticas, container, false);
        TextView tv = view.findViewById(R.id.texto);
        tv.setText("Fragment: Estatísticas");

        return view;
    }
}
