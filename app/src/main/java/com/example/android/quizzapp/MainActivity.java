package com.example.android.quizzapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.android.quizzapp.R;

import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends AppCompatActivity {

    int totalScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void scoreView(View view) {
        //Check if the first answer is correct
        RadioButton firstAnswer = (RadioButton) findViewById(R.id.correctAnswerOne);
        boolean firstCorrect = firstAnswer.isChecked();

        //Check if the Second first checkbox answer is correct
        CheckBox secondAnswer = (CheckBox) findViewById(R.id.correctAnswerTwo);
        boolean secondCorrect = secondAnswer.isChecked();

        //Check if the Second checkbox answer is correct
        CheckBox secondCorrectAnswer = (CheckBox) findViewById(R.id.secondCorrectAnswer);
        boolean secondCorrectAns = secondCorrectAnswer.isChecked();

        //Check if the Second checkbox answer is unchecked
        CheckBox secondIncorrectAnswer = (CheckBox) findViewById(R.id.incorrectAnswerTwo);
        boolean secondIncorrectAns = secondIncorrectAnswer.isChecked();

        //Check if the third answer is correct
        RadioButton thirdAnswer = (RadioButton) findViewById(R.id.correctAnswerThree);
        boolean thirdCorrect = thirdAnswer.isChecked();

        //Check if the fourth answer is correct
        EditText fourthAnswer = (EditText) findViewById(R.id.correctAnswerFour);
        String fourthCorrect = fourthAnswer.getText().toString();
        //Check if the fifth answer is correct
        RadioButton fifthAnswer = (RadioButton) findViewById(R.id.correctAnswerFive);
        boolean fifthCorrect = fifthAnswer.isChecked();

        checkAnswer1(firstCorrect);
        checkAnswer2(secondCorrect, secondCorrectAns,secondIncorrectAns);
        checkAnswer3(thirdCorrect);
        checkAnswer4(fourthCorrect);
        checkAnswer5(fifthCorrect);
        Toast.makeText(this, "Your score is: " + totalScore, Toast.LENGTH_SHORT).show();
        totalScore = 0;
    }

    private int checkAnswer1(boolean firstCorrect) {
        if (firstCorrect) {
            totalScore += 1;
        } else {
            return totalScore;
        }
        return totalScore;
    }

    private int checkAnswer2(boolean secondCorrect, boolean secondCorrectAns,boolean secondIncorrectAns) {
        if (secondCorrect && secondCorrectAns && !secondIncorrectAns) {
            totalScore += 1;
        } else {
            return totalScore;
        }
        return totalScore;
    }

    private int checkAnswer3(boolean thirdCorrect) {
        if (thirdCorrect) {
            totalScore += 1;
        } else {
            return totalScore;
        }
        return totalScore;
    }

    private int checkAnswer4(String fourthCorrect) {
        String relative = "RELATIVE";
        if (fourthCorrect.equals(relative)) {
            totalScore += 1;
        } else {
            return totalScore;
        }
        return totalScore;
    }

    private int checkAnswer5(boolean fifthCorrect) {
        if (fifthCorrect) {
            totalScore += 1;
        } else {
            return totalScore;
        }
        return totalScore;
    }
}
