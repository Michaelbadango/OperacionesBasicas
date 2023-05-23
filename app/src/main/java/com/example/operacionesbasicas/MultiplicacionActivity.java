package com.example.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MultiplicacionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacion);
    }

    public void salir2(View view){
        this.finish();
    }

    public void Multi(View view){
        EditText N1 = (EditText) findViewById(R.id.txt_a);
        EditText N2 = (EditText) findViewById(R.id.txt_b);
        TextView re = findViewById(R.id.resu);
        double resultado = Double.parseDouble( N1.getText().toString()) * Double.parseDouble( N2.getText().toString());

        re.setText(resultado+"");
    }
}