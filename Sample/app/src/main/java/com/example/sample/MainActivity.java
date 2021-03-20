package com.example.sample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText editText ;
    public static final String Extra_Name="com.example.sample.extra.NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void display(View v)
    {
        editText=findViewById(R.id.name);
        Intent intent=new Intent(this,MainActivity2.class);

        String name=editText.getText().toString();
        intent.putExtra(Extra_Name,name);
        startActivity(intent);
    }
}