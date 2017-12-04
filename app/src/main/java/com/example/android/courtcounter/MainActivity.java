package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(1);
    }

    public void giveA3points() {
        displayForTeamA(3);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById (R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

}
system