package com.example.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RestaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);
    }

    public void regresar1(View view){
        this.finish();
    }

    public void restar(View view){
        EditText n1 = (EditText) findViewById(R.id.a);
        EditText n2 = (EditText) findViewById(R.id.b);
        TextView r = findViewById(R.id.resultado);

        double result = Double.parseDouble( n1.getText().toString()) - Double.parseDouble( n2.getText().toString());
        r.setText(result+"");
    }
}