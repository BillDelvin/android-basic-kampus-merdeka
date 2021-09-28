package com.example.kampus_merdeka_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setText(View view){
        final EditText editText = findViewById(R.id.inputName);
        final TextView textName = findViewById(R.id.setTextName);
        final String textValue = editText.getText().toString();
        textName.setText(textValue);
    }

    public void test(){

    }
}