package com.example.samplelist;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] arr = {"Dhanraj", "Patil", "From", "Vellore Institute of Technology", "Dhanraj", "Patil", "From", "Vellore Institute of Technology", "Dhanraj", "Patil", "From", "Vellore Institute of Technology"};
        listView = findViewById(R.id.listview);
        //ArrayAdapter<String> ad=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arr);
        //listView.setAdapter(ad);
        DhanrajAdapter da = new DhanrajAdapter(this, R.layout.dhanrajadapter, arr);
        listView.setAdapter(da);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Hi",Toast.LENGTH_SHORT).show();
            }
        });
    }
}