package com.example.rank.newnewnew;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.rank.newnewnew.adapters.AbasAdapter;
import com.example.rank.newnewnew.extras.SlidingTabLayout;
import com.example.rank.newnewnew.fragments.CalendarioFragment;
import com.example.rank.newnewnew.fragments.CategoriasFragment;
import com.example.rank.newnewnew.fragments.EstatisticasFragment;
import com.example.rank.newnewnew.fragments.EventosFragment;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initViewPager();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_teste, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_configuracoes:
                startConfiguracoes();
                return true;
            case R.id.menu_sair:
                startLogin();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void startConfiguracoes() {
        Intent intent = new Intent(this, ConfiguracoesActivity.class);
        startActivity(intent);
    }
    public void startLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    private void initViewPager() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        if (viewPager != null) {
            setupViewPager(viewPager);
        }

        SlidingTabLayout tabLayout = (SlidingTabLayout) findViewById(R.id.tabs);
        tabLayout.setSelectedIndicatorColors(Color.WHITE);
        tabLayout.setTextColorResId(R.color.tabs_text_color);

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
        AbasAdapter adapter = new AbasAdapter(getSupportFragmentManager());
        adapter.adicionar(new EstatisticasFragment(), "Principal");
        adapter.adicionar(new EventosFragment(), "Eventos");
        adapter.adicionar(new CategoriasFragment(), "Categorias");
        adapter.adicionar(new CalendarioFragment(), "Calendário");
        viewPager.setAdapter(adapter);
    }
}
