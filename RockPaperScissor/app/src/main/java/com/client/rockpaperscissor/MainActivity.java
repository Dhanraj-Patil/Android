package com.client.rockpaperscissor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.*;

public class MainActivity extends AppCompatActivity {
    Random random=new Random();
    int botSelection=0,userSelection=0;
    int botCount=0,userCount=0;
    ImageButton rock,paper,scissor;
    TextView bot,user,result,botStatus;
    Button restart;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rock=findViewById(R.id.rock);
        paper=findViewById(R.id.paper);
        scissor=findViewById(R.id.scissor);
        bot=findViewById(R.id.bot);
        user=findViewById(R.id.user);
        result=findViewById(R.id.result);
        botStatus=findViewById(R.id.botStatus);
        restart=findViewById(R.id.restart);

        botStatus.setText("");

        bot.setText(Integer.toString(botCount));
        user.setText(Integer.toString(userCount));

        restart.setOnClickListener(v ->{
            botStatus.setText("");
            result.setText("");
            botSelection=0;
            userSelection=0;
            botCount=0;
            userCount=0;
            bot.setText(Integer.toString(botCount));
            user.setText(Integer.toString(userCount));
        });

        rock.setOnClickListener(v -> {
            userSelection = 1;
            botSelection = random.nextInt(3) + 1;
            String winner = evaluate(botSelection, userSelection);
            action(winner,bot,user,clarify(botSelection));
        });
        paper.setOnClickListener(v -> {
            userSelection = 2;
            botSelection = random.nextInt(3) + 1;
            String winner = evaluate(botSelection, userSelection);
            action(winner,bot,user,clarify(botSelection));
        });
        scissor.setOnClickListener(v -> {
            userSelection = 3;
            botSelection = random.nextInt(3) + 1;
            String winner = evaluate(botSelection, userSelection);
            action(winner,bot,user,clarify(botSelection));
        });
        if(botCount==3 || userCount==3){
            if(botCount==3){
                result.setTextColor(this.getResources().getColor(R.color.black));
                result.setText("You Lost");
            }else {
                result.setText("You Won");
            }
        }
    }

    String clarify(int botSelection){
        if(botSelection==1)
            return "Rock";
        else if(botSelection==2)
            return "Paper";
        else
            return "Scissor";
    }

    @SuppressLint("SetTextI18n")
    void action(String winner, TextView bot, TextView user,String botSelection){
        if(botCount<3 && userCount<3) {
            botStatus.setText("Bot chose: "+botSelection);
            if (winner.equals("bot")) {
                botCount += 1;
                bot.setText(Integer.toString(botCount));
            } else if (winner.equals("user")) {
                userCount += 1;
                user.setText(Integer.toString(userCount));
            }
        }
        if(botCount==3 || userCount==3){
            botStatus.setText("");
            if(botCount==3){
                result.setTextColor(this.getResources().getColor(R.color.black));
                result.setText("You Lost");
            }else {
                result.setText("You Won");
            }
        }
    }

    String evaluate(int bot, int user){
        if((bot==1 && user==3)||(bot==2 && user==1)||(bot==3 && user==2)) {
            return "bot";
        }else if(bot==user){
            return "tie";
        }else{
            return "user";
        }
    }
}