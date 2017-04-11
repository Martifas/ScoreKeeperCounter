package com.example.android.scorekeepercounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static com.example.android.scorekeepercounter.R.id.cornerA;

public class MainActivity extends AppCompatActivity {
    int teamAscore = 0;
    int teamBscore = 0;
    int teamAcorner = 0;
    int teamBCorner = 0;
    int teamApenalty = 0;
    int teamBpenalty = 0;
    int teamAshot = 0;
    int teamBshot = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamAscore);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamBScore);
        scoreView.setText(String.valueOf(score));
    }

    public void cornerTeamA(int corner) {
        TextView cornerView = (TextView) findViewById(cornerA);
        cornerView.setText("Corners: " + String.valueOf(corner));
    }

    public void cornerTeamB(int corner) {
        TextView cornerView = (TextView) findViewById(R.id.cornerB);
        cornerView.setText("Corners: " + String.valueOf(corner));
    }

    public void penaltyTeamA(int penalty) {
        TextView penaltyView = (TextView) findViewById(R.id.penaltyA);
        penaltyView.setText("Penalties: " + String.valueOf(penalty));
    }

    public void penaltyTeamB(int penalty) {
        TextView penaltyView = (TextView) findViewById(R.id.penaltyB);
        penaltyView.setText("Penalties: " + String.valueOf(penalty));
    }

    public void shotTeamA(int shot) {
        TextView shotView = (TextView) findViewById(R.id.shotA);
        shotView.setText("Shots on target: " + String.valueOf(shot));
    }

    public void shotTeamB(int shot) {
        TextView shotView = (TextView) findViewById(R.id.shotB);
        shotView.setText("Shots on target: " + String.valueOf(shot));
    }

    public void goalA(View v) {
        teamAscore = teamAscore + 1;
        teamAshot = teamAshot + 1;
        displayForTeamA(teamAscore);
        shotTeamA(teamAshot);
    }

    public void goalB(View v) {
        teamBscore = teamBscore + 1;
        teamBshot = teamBshot + 1;
        displayForTeamB(teamBscore);
        shotTeamB(teamBshot);
    }

    public void cornerA(View v) {
        teamAcorner = teamAcorner + 1;
        cornerTeamA(teamAcorner);
    }

    public void cornerB(View v) {
        teamBCorner = teamBCorner + 1;
        cornerTeamB(teamBCorner);
    }

    public void penaltyA(View v) {
        teamApenalty = teamApenalty + 1;
        penaltyTeamA(teamApenalty);
    }

    public void penaltyB(View v) {
        teamBpenalty = teamBpenalty + 1;
        penaltyTeamB(teamBpenalty);
    }

    public void shotA(View v) {
        teamAshot = teamAshot + 1;
        shotTeamA(teamAshot);
    }

    public void shotB(View v) {
        teamBshot = teamBshot + 1;
        shotTeamB(teamBshot);
    }

    public void reset_score(View v) {
        teamAscore = 0;
        teamBscore = 0;
        teamAcorner = 0;
        teamBCorner = 0;
        teamApenalty = 0;
        teamBpenalty = 0;
        teamAshot = 0;
        teamBshot = 0;
        displayForTeamA(teamAscore);
        shotTeamA(teamAshot);
        displayForTeamB(teamBscore);
        shotTeamB(teamBshot);
        cornerTeamA(teamAcorner);
        cornerTeamB(teamBCorner);
        penaltyTeamA(teamApenalty);
        penaltyTeamB(teamBpenalty);
    }
    }
