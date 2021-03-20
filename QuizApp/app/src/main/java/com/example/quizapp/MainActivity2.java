package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.atomic.AtomicInteger;

public class MainActivity2 extends AppCompatActivity {
    String[] a={"Is this car manufactured by Ferrari ?","Does this car have V8 engine ?","Is this car black in colour ?",
            "Does this car have 8 seats ?","Is this an Italian car ?"};
    boolean[] b={true,true,false,false,true};
    int index=0,score=0;
    TextView textView;
    Button yes;
    Button no;
    @SuppressLint("ShowToast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        AtomicInteger Score= new AtomicInteger(intent.getIntExtra(MainActivity.CAR1, 0));
        textView=findViewById(R.id.textView);
        yes=findViewById(R.id.button4);
        no=findViewById(R.id.button3);

        textView.setText(a[index]);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index + 1 == a.length+1) {
                    Toast.makeText(MainActivity2.this, "Your Score is: " + (score ), Toast.LENGTH_SHORT).show();
                }
                else {
                    if (b[index]) {
                        ++score;
                    }
                    if(index<4)
                        textView.setText(a[++index]);
                    else
                        index=a.length;
                }
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index + 1 == a.length+1) {
                    Toast.makeText(MainActivity2.this, "Your score is: " + (score ), Toast.LENGTH_SHORT).show();
                }
                else {
                    if (!b[index]) {
                        ++score;
                    }
                    if(index<4)
                        textView.setText(a[++index]);
                    else
                        index=a.length;
                }
            }
        });
        }
}