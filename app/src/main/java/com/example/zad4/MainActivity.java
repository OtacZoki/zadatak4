package com.example.zad4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    private EditText jedan;
    private EditText dva;
    private EditText resenje;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jedan = (EditText) findViewById(R.id.editTextJedan);

        dva = (EditText) findViewById(R.id.editTextDva);


        resenje = (EditText) findViewById(R.id.editTextTri);

    }




    public void plus(View view){
        double j = Double.parseDouble(jedan.getText().toString());
        double d = Double.parseDouble(dva.getText().toString());

        resenje.setText(String.valueOf(j+d));

    }
}