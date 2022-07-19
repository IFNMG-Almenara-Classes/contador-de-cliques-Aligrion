package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int cont = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void contar (View view)
    {
        cont++;
        TextView nome = findViewById(R.id.nome);
        nome.setText(""+cont);

    }
    public void diminuir (View view)
    {
        cont--;
        TextView nome = findViewById(R.id.nome);
        nome.setText(""+cont);

    }
    public void zerar (View view)
    {
        cont = 0;
        TextView nome = findViewById(R.id.nome);
        nome.setText(""+cont);

    }
}