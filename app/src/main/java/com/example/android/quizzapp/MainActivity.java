package com.example.android.quizzapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.id;
import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Score(View view) {
        // Check if Answer 1 is correct.
        CheckBox correctAnswer1 = (CheckBox) findViewById(R.id.correctAnswerOne);
        boolean theCorrectAnswer1 = correctAnswer1.isChecked();

        //Check if Answer 2 is correct.
        CheckBox correctAnswer2 = (CheckBox) findViewById(R.id.correctAnswerTwo);
        boolean theCorrectAnswer2 = correctAnswer2.isChecked();

        //Check if Asnwer 3 is correct.
        CheckBox correctAnswer3 = (CheckBox) findViewById(R.id.correctAnswerThree);
        boolean theCorrectAnswer3 = correctAnswer3.isChecked();

        //Check if Answer 4 is correct.
        CheckBox correctAnswer4 = (CheckBox) findViewById(R.id.correctAnswerFour);
        boolean theCorrectAnswer4 = correctAnswer4.isChecked();

        //Check if Answer 5 is correct.
        CheckBox correctAnswer5 = (CheckBox) findViewById(R.id.correctAnswerFive);
        boolean theCorrectAnswer5 = correctAnswer5.isChecked();

        //Call the method calculateScore and pass the values
        calculateScore(theCorrectAnswer1, theCorrectAnswer2, theCorrectAnswer3, theCorrectAnswer4, theCorrectAnswer5);

        Context context = getApplicationContext();
        CharSequence text = "Your Score is:" + score;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        score = 0;
        return;
    }

    /*
    @param correctAnswer1 is the correct answer for the first question.
     */
    private int calculateScore(boolean theCorrectAnswer1, boolean theCorrectAnswer2, boolean theCorrectAnswer3
            , boolean theCorrectAnswer4, boolean theCorrectAnswer5) {


        if (theCorrectAnswer1 && !theCorrectAnswer2 && !theCorrectAnswer3 && !theCorrectAnswer4 && !theCorrectAnswer5 ) {
            return score = 1;
        } else if (theCorrectAnswer1 && theCorrectAnswer2 && !theCorrectAnswer3 && !theCorrectAnswer4 && !theCorrectAnswer5) {
            return score = 2;
        } else if (theCorrectAnswer1 && theCorrectAnswer2 && theCorrectAnswer3 && !theCorrectAnswer4 && !theCorrectAnswer5) {
            return score = 3;
        } else if (theCorrectAnswer1 && theCorrectAnswer2 && theCorrectAnswer3 && theCorrectAnswer4 && !theCorrectAnswer5) {
            return score = 4;
        } else if (theCorrectAnswer1 && theCorrectAnswer2 && theCorrectAnswer3 && theCorrectAnswer4 && theCorrectAnswer5) {
            return score = 5;
        } else {
            return score;
        }

    }
}



