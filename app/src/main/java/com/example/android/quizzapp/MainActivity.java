package com.example.android.quizzapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Score(View view){
    //score += 1;
        CheckBox correctAnswer1 = (CheckBox) findViewById(R.id.correctAnswerOne);
        boolean theCorrectAnswer1 = correctAnswer1.isChecked();
        calculateScore(theCorrectAnswer1);

        Context context = getApplicationContext();
        CharSequence text = "Your Score is:"+ score;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        return;
    }

    /*
    @param correctAnswer1 is the correct answer for the first question.
     */
    private int calculateScore(boolean theCorrectAnswer1) {


        if (theCorrectAnswer1) {
            return score = 1 ;
        //} else if (correctAnswer2) {
        //    return score= 4;
        //} else if (correctAnswer3) {
        //    return score=3;
        } else {
            return score;
        }
    }

    }


