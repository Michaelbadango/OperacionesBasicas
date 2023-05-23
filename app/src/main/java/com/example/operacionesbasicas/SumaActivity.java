package com.example.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SumaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
    }

    public void regresar(View view){
        this.finish();
    }

    public void sumar(View view){
        EditText N1 = (EditText) findViewById(R.id.txt_n1);
        EditText N2 = (EditText) findViewById(R.id.txt_n2);
        TextView re = findViewById(R.id.txt_r);
        double resultado = Double.parseDouble( N1.getText().toString()) + Double.parseDouble( N2.getText().toString());

        re.setText(resultado+"");
    }
}