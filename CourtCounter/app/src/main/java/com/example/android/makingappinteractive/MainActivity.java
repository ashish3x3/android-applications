package com.example.android.makingappinteractive;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // PASTE CODE YOU WANT TO TEST HERE
//        display1("This is Box 1.");
//        display2("And this is Box 2.");
//        display3("And look! Box 3!");

    }

    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     */

    public void display(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(text);
    }

    public void display(int text) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(text + "");
    }

    public void display1(String text) {
        display(text);
    }

    /*public void display2(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view_2);
        t.setText(text);
    }

    public void display3(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view_3);
        t.setText(text);
    }*/

    public void inc3(View view) {
        scoreTeamA += 3;
        TextView t = (TextView) findViewById(R.id.display_score_text_view);
        t.setText(""+scoreTeamA);
    }

    public void inc2(View view) {
        scoreTeamA += 2;
        TextView t = (TextView) findViewById(R.id.display_score_text_view);
        t.setText(String.valueOf(scoreTeamA));
    }

    public void inc1(View view) {
        scoreTeamA += 1;
        TextView t = (TextView) findViewById(R.id.display_score_text_view);
        t.setText(String.valueOf(scoreTeamA));
    }

    public void reset(View view) {
        scoreTeamA = 0;
        TextView t = (TextView) findViewById(R.id.display_score_text_view);
        t.setText(String.valueOf(scoreTeamA));
    }

    public void inc3TeamB(View view) {
        scoreTeamB += 3;
        TextView t = (TextView) findViewById(R.id.display_team_b__score_text_view);
        t.setText(""+scoreTeamB);
    }

    public void inc2TeamB(View view) {
        scoreTeamB += 2;
        TextView t = (TextView) findViewById(R.id.display_team_b__score_text_view);
        t.setText(String.valueOf(scoreTeamB));
    }

    public void inc1TeamB(View view) {
        scoreTeamB += 1;
        TextView t = (TextView) findViewById(R.id.display_team_b__score_text_view);
        t.setText(String.valueOf(scoreTeamB));
    }

    public void resetTeamB(View view) {
        scoreTeamB = 0;
        TextView t = (TextView) findViewById(R.id.display_team_b__score_text_view);
        t.setText(String.valueOf(scoreTeamB));
    }
}