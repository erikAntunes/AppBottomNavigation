package com.example.bottomnavigationapp;

import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tituloTextView;
    private BottomNavigationView bottomNavigationItemView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tituloTextView = findViewById(R.id.titulo_text_view);
        bottomNavigationItemView = findViewById(R.id.bottom_navigation);



        bottomNavigationItemView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                int i = menuItem.getItemId();
                if (i == R.id.compras) {
                    tituloTextView.setText("Compras");


                } else if (i == R.id.listas) {
                    tituloTextView.setText("Listas Salvas");

                } else {
                    tituloTextView.setText("Promoções");

                }
                return true;
            }
        });
    }
}
