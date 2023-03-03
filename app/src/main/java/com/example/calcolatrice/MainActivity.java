package com.example.calcolatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b = new Button(R.id.btnSomma);
    EditText e1 = new EditText(R.id.editTextV1);
    EditText e2 = new EditText(R.id.editTextV2);
    TextView t1 = new TextView(R.id.textViewV1);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}