package com.client.crossandnuts;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import java.io.*;

import java.util.*;

public class MainActivity extends AppCompatActivity {
    Random random=new Random();
    ImageButton rock,paper,scissors;
    TextView bot,user,result;
    int userSelection=0,botSelection=0;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rock=findViewById(R.id.rock);
        paper=findViewById(R.id.paper);
        scissors=findViewById(R.id.scissors);
        bot=findViewById(R.id.bot);
        user=findViewById(R.id.user);
        result=findViewById(R.id.result);
        bot.setText("1");
        user.setText("1");
        while ((!bot.getText().equals("3"))&&(!user.getText().equals("3"))) {
            rock.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    userSelection = 1;
                    botSelection=random.nextInt(3);
                    Toast.makeText(MainActivity.this,"Clicked",Toast.LENGTH_SHORT).show();
                }
            });
            paper.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    userSelection = 2;
                    botSelection=random.nextInt(3);
                }
            });
            scissors.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    userSelection = 2;
                    botSelection=random.nextInt(3);
                }
            });
        }
    }
}