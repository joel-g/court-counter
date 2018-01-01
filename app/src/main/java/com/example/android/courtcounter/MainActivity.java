package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
    }

    public void giveA3points(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void giveB3points(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void giveA2points(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void giveB2points(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void giveA1points(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void giveB1points(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById (R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById (R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
