package com.example.samplerecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] arr={"Dhanraj","Patil","Studing","IN","Vellore Institute of Technology","Dhanraj","Patil","Studing","IN","Vellore Institute of Technology","Dhanraj","Patil","Studing","IN","Vellore Institute of Technology"};
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ca=new CustomAdapter(arr);
        recyclerView.setAdapter(ca);
        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"HI", Toast.LENGTH_SHORT).show();
            }
        });
    }
}