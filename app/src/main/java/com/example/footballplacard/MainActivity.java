package com.example.footballplacard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int goals1=0, goals2=0;
    int fouls1=0, fouls2=0;
    int offside1=0, offside2=0;
    int yellow1=0, yellow2=0;
    int red1=0, red2=0;

    TextView goal1, goal2, foul1, foul2, off1, off2, yell1, yell2, r1, r2;
    EditText nome1,nome2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goal1 = findViewById(R.id.goals_1);
        goal2 = findViewById(R.id.goals_2);
        foul1 = findViewById(R.id.fouls_1);
        foul2 = findViewById(R.id.fouls_2);
        off1 = findViewById(R.id.offsides_1);
        off2 = findViewById(R.id.offsides_2);
        yell1 = findViewById(R.id.yellow_cards_1);
        yell2 = findViewById(R.id.yellow_cards_2);
        r1 = findViewById(R.id.red_cards_1);
        r2 = findViewById(R.id.red_cards_2);

        nome1 = findViewById(R.id.team_1);
        nome2 = findViewById(R.id.team_2);

    }

    public void incGoal1(View view){
        goals1 = increment(goal1, goals1);
    }
    public void decGoal1(View view){
        goals1 = decrement(goal1, goals1, "Goal");
    }
    public void incGoal2(View view){
        goals2 = increment(goal2, goals2);
    }
    public void decGoal2(View view){
        goals2 = decrement(goal2, goals2,"Goal");
    }



    public void incFouls1(View view){
        fouls1 = increment(foul1, fouls1);
    }
    public void decFouls1(View view){
        fouls1 = decrement(foul1, fouls1, "Fouls");
    }
    public void incFoul2(View view){
        fouls2 = increment(foul2, fouls2);
    }
    public void decFoul2(View view){
        fouls2 = decrement(foul2, fouls2,"Fouls");
    }


    public void incOffside1(View view){
        offside1 = increment(off1, offside1);
    }
    public void decOffside1(View view){
        offside1 = decrement(off1, offside1, "Offsides");
    }
    public void incOffside2(View view){
        offside2 = increment(off2, offside2);
    }
    public void decOffside2(View view){
        offside2 = decrement(off2, offside2,"Offsides");
    }


    public void incYellow1(View view){
        yellow1 = increment(yell1, yellow1);
    }
    public void decYellow1(View view){
        yellow1 = decrement(yell1, yellow1, "Yellow cards");
    }
    public void incYellow2(View view){
        yellow2 = increment(yell2, yellow2);
    }
    public void decYellow2(View view){
        yellow2 = decrement(yell2, yellow2,"Yellow cards");
    }


    public void incRed1(View view){
        red1 = increment(r1, red1);
    }
    public void decRed1(View view){
        red1 = decrement(r1, red1, "Red cards");
    }
    public void incRed2(View view){
        red2 = increment(r2, red2);
    }
    public void decRed2(View view){
        red2 = decrement(r2, red2,"Red cards");
    }


    public int increment(TextView tv, int inc1){

        inc1++;
        tv.setText(inc1+"");
        return inc1;

    }

    public int decrement(TextView tv, int dec1, String type){
        if(dec1<=0){
            Toast toast = Toast.makeText(this, type+" não podem ser negativos", Toast.LENGTH_SHORT);
            toast.show();
            return dec1;
        }else{
            dec1--;
            tv.setText(dec1+"");
            return dec1;
        }

    }

    public void startCount(View view){

        Chronometer chronometer = (Chronometer) findViewById(R.id.count);
        chronometer.setBase(SystemClock.elapsedRealtime());
        chronometer.start();

    }

    public void resetCount(View view){

        Chronometer chronometer = (Chronometer) findViewById(R.id.count);
        chronometer.setBase(SystemClock.elapsedRealtime());
        chronometer.stop();
        goals1 = 0;
        goals2 = 0;
        fouls1=0;
        fouls2=0;
        offside1=0;
        offside2=0;
        yellow1=0;
        yellow2=0;
        red1=0;
        red2=0;
        goal1.setText(goals1+"");
        goal2.setText(goals2+"");
        foul1.setText(fouls1+"");
        foul2.setText(fouls2+"");
        off1.setText(offside1+"");
        off2.setText(offside2+"");
        yell1.setText(yellow1+"");
        yell2.setText(yellow2+"");
        r1.setText(red1+"");
        r2.setText(red2+"");
        nome1.setText("");
        nome2.setText("");
    }

}