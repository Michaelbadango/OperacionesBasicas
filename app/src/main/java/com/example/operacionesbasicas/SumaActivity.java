package com.example.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SumaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
    }

    private static final int REQUEST_CODE_SPEECH_INPUT = 100;

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

    private static final int RECOGNIZE_SPEECH_ACTIVITY = 1;
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        EditText N1 = (EditText) findViewById(R.id.txt_n1);
        EditText N2 = (EditText) findViewById(R.id.txt_n2);
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case RECOGNIZE_SPEECH_ACTIVITY:
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> speech = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    String strSpeech2Text = speech.get(0);
                    N1.setText(strSpeech2Text);
                    N2.setText(strSpeech2Text);
                }
                break;
            default:
                break;
        }
    }

    public void onClickImgBtnHablar(View v) {
        Intent intentActionRecognizeSpeech = new Intent(
                RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        // Configura el Lenguaje (Español-México)
        intentActionRecognizeSpeech.putExtra(
                RecognizerIntent.EXTRA_LANGUAGE_MODEL, "es-MX");
        try {
            startActivityForResult(intentActionRecognizeSpeech,
                    RECOGNIZE_SPEECH_ACTIVITY);
        } catch (ActivityNotFoundException a) {
            Toast.makeText(getApplicationContext(),
                    "Tú dispositivo no soporta el reconocimiento por voz",
                    Toast.LENGTH_SHORT).show();
        }
    }
}