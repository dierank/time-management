package com.example.rank.newnewnew.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.TextView;

import com.example.rank.newnewnew.R;

public class CalendarioFragment extends Fragment
{
    CalendarView calendarView;
    TextView dataAtual;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.fragment_calendario, container, false);

        TextView texto = view.findViewById(R.id.texto_calendario);
        texto.setText("Fragment: Calendário");

        dataAtual = view.findViewById(R.id.dataAtual_calendario);
        dataAtual.setText("Data: ");

       /*calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                dataAtual.setText("Date: " + i2 + " / " + i1 + " / " + i);
            }
        });*/

        return view;
    }
}
