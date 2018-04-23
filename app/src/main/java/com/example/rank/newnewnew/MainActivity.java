package com.example.rank.newnewnew;

import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.example.rank.newnewnew.adapters.AbasAdapter;
import com.example.rank.newnewnew.extras.SlidingTabLayout;
import com.example.rank.newnewnew.fragments.CalendarioFragment;
import com.example.rank.newnewnew.fragments.CategoriasFragment;
import com.example.rank.newnewnew.fragments.EstatisticasFragment;
import com.example.rank.newnewnew.fragments.EventosFragment;

public class MainActivity extends AppCompatActivity
{
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Inicializa ViewPager e carrega as tabs
        initViewPager();
    }

    private void initViewPager() {
        // Instancia o ViewPager a partir do resource adicionado no layout activity_main.xml
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        if (viewPager != null) {
            setupViewPager(viewPager);
        }

        // Da mesma forma o SlidingTabLayout, também incluso no layout activity_main.xml
        SlidingTabLayout tabLayout = (SlidingTabLayout) findViewById(R.id.tabs);
        //noinspection ConstantConditions
        tabLayout.setSelectedIndicatorColors(Color.WHITE);
        tabLayout.setTextColorResId(R.color.tabs_text_color);

        // Adicionando um callback para disparar eventos ao realizar ações com as abas.
        tabLayout.setOnPageChangeListener(new ViewPager.OnPageChangeListener()  {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                Log.i(TAG, "Tab #" + position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
        tabLayout.setViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        // Instancia o adapter para adicionar cada fragment que será construído em cada aba.
        AbasAdapter adapter = new AbasAdapter(getSupportFragmentManager());
        adapter.adicionar(new EstatisticasFragment(), "Principal");
        adapter.adicionar(new CalendarioFragment(), "Calendário");
        adapter.adicionar(new CategoriasFragment(), "Categorias");
        adapter.adicionar(new EventosFragment(), "Eventos");
        viewPager.setAdapter(adapter);
    }
}
