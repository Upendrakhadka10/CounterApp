package com.example.scorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int TeamAScore;
    int TeamBScore;
    int TeamAWicket;
    int TeamBWicket;
    private TextView textViewTeamAScore;
    private  TextView textViewTeamBScore;
    private TextView textViewTeamAWicket;
    private TextView textViewTeamBWicket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewTeamAScore = findViewById(R.id.Team_a_score);
        textViewTeamAWicket = findViewById(R.id.Team_a_wicket);
        textViewTeamBScore = findViewById((R.id.Team_b_score));
        textViewTeamBWicket = findViewById((R.id.Team_b_wicket));
    }

    public void displayTeamAScore(int score){
        textViewTeamAScore.setText(String.valueOf(score));
    }

    public void displayTeamAWicket(int wicket){
        textViewTeamAWicket.setText((String.valueOf((wicket))));
    }
    public void displayTeamBScore(int score){
        textViewTeamBScore.setText((String.valueOf(score)));
    }
    public void displayTeamBWicket(int wicket){
        textViewTeamBWicket.setText((String.valueOf(wicket)));
    }

    public void addSixForTeamA(View view) {
        TeamAScore = TeamAScore + 6;
        displayTeamAScore(TeamAScore);
    }

    public void addFourForTeamA(View view) {
        TeamAScore = TeamAScore + 4;
        displayTeamAScore(TeamAScore);
    }

    public void addTwoForTeamA(View view) {
        TeamAScore = TeamAScore + 2;
        displayTeamAScore(TeamAScore);
    }

    public void addOneForTeamA(View view) {
        TeamAScore = TeamAScore + 1;
        displayTeamAScore(TeamAScore);
    }

    public void addWicketForTeamA(View view) {
        if(TeamAWicket <= 9){
            TeamAWicket = TeamAWicket + 1;
            displayTeamAWicket(TeamAWicket);
        }


    }

    public void addSixForTeamB(View view) {
        TeamBScore = TeamBScore + 6;
        displayTeamBScore(TeamBScore);
    }

    public void addFourForTeamB(View view) {
        TeamBScore = TeamBScore + 4;
        displayTeamBScore(TeamBScore);
    }

    public void addTwoForTeamB(View view) {
        TeamBScore = TeamBScore + 2;
        displayTeamBScore(TeamBScore);
    }

    public void addOneForTeamB(View view) {
        TeamBScore = TeamBScore + 1;
        displayTeamBScore(TeamBScore);
    }

    public void addWicketForTeamB(View view) {
        if(TeamBWicket <= 9){
            TeamBWicket = TeamBWicket + 1;
            displayTeamBWicket(TeamBWicket);
        }

    }

    public void resetScore(View view) {
        TeamAScore = 0;
        TeamBScore = 0;
        TeamAWicket = 0;
        TeamBWicket = 0;
        displayTeamAScore(TeamAScore);
        displayTeamBScore(TeamBScore);
        displayTeamAWicket(TeamAWicket);
        displayTeamBWicket(TeamBWicket);
    }
}
