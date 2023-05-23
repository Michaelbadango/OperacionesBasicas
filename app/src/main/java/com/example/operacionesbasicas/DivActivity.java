package com.example.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DivActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_div);
    }

    public void regresar(View view){
        this.finish();
    }

    public void Dividir(View view){
        EditText N1 = (EditText) findViewById(R.id.txt_num1);
        EditText N2 = (EditText) findViewById(R.id.txt_num2);
        TextView re = findViewById(R.id.total);
        double resultado = Double.parseDouble( N1.getText().toString()) / Double.parseDouble( N2.getText().toString());
        re.setText(resultado+"");
    }
}