package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static final String CAR1="com.example.quizapp.extra.car1";
    public static final String CAR2="com.example.quizapp.extra.car2";
    Button car;
    Button mustang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        car=findViewById(R.id.button);
        mustang=findViewById(R.id.button2);
    }
    public void display1(View v)
    {
        Intent intent=new Intent(this,MainActivity2.class);
        intent.putExtra(CAR1,0);
        startActivity(intent);
    }
    public void display2(View v)
    {
        Intent intent=new Intent(this,MainActivity3.class);
        intent.putExtra(CAR2,0);
        startActivity(intent);
    }
}