package com.example.android.coursecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    int score1 = 0;
    int score2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  three(View v){
        score1 = score1 + 3;
        displayForTeamA(score1);
    }

    public void  two(View v){
        score1 = score1 + 2;
        displayForTeamA(score1);
    }

    public void  free(View v){
        score1 = score1 + 1;
        displayForTeamA(score1);
    }

    public void  threea(View v){
        score2 = score2 + 3;
        displayForTeamB(score2);
    }

    public void  twoa(View v){
        score2 = score2 + 2;
        displayForTeamB(score2);
    }

    public void  freea(View v){
        score2 = score2 + 1;
        displayForTeamB(score2);
    }

    public void displayForTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(this.score1));
    }

    public void displayForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(this.score2));
    }

    public void reset(View v){
        score1 = 0;
        score2 = 0;
        displayForTeamB(score1);
        displayForTeamA(score2);

    }

}