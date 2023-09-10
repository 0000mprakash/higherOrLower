package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void generaterandomnumber(){
        Random random = new Random();
        randomNumber = random.nextInt(20)+1;
    }

    public void clickFunction(View view){
        EditText value=(EditText) findViewById(R.id.editTextNumber);
        Log.i("Info","Button Pressed!");
        Log.i("Value",value.getText().toString());
        int in = Integer.valueOf(value.getText().toString());
        if (in==randomNumber){
            Toast.makeText(this, "yeah you are right,try again", Toast.LENGTH_SHORT).show();
            generaterandomnumber();
        }
        else if(in>randomNumber){
            Toast.makeText(this, "Lower", Toast.LENGTH_SHORT).show();
        }
        else if(in<randomNumber){
            Toast.makeText(this, "Higher", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generaterandomnumber();

    }
}