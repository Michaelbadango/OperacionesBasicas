package com.example.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo Para Cambiar de Activiti
    public void verSuma(View view){
        Intent intent = new Intent(this, SumaActivity.class);
        view.getContext().startActivity(intent);
    }

    public void verResta(View view){
        Intent intent = new Intent(this, RestaActivity.class);
        view.getContext().startActivity(intent);
    }

    public void verMulti(View view){
        Intent intent = new Intent(this, MultiplicacionActivity.class);
        view.getContext().startActivity(intent);
    }

    public void verDiv(View view){
        Intent intent = new Intent(this, DivActivity.class);
        view.getContext().startActivity(intent);
    }
}