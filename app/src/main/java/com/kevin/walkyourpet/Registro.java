package com.kevin.walkyourpet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Registro extends AppCompatActivity {

    Button btnRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        initComponents();

        btnRegistro.setOnClickListener(v -> {
            iniciarHome();
        });
    }

    private void initComponents(){
        btnRegistro= findViewById(R.id.btnRegistro);
    }

    private void iniciarHome(){
        Intent intent = new Intent(getApplicationContext(),Home.class);
        startActivity(intent);
    }
}