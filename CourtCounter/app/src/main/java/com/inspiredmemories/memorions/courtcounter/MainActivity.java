package com.inspiredmemories.memorions.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
    Variable Initialization
     */
    int scoreTeamA = 0, scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    Display Methods to the Team A Scores
    */
    public void updateScoreThree(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void updateScoreTwo(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void updateScoreFreeThrow(View view){
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /*
    Display Methods to the Team B Scores
    */
    public void updateScoreThreeB(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void updateScoreTwoB(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void updateScoreFreeThrowB(View view){
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Method to Update the Text after getting the conclusion r
     */
    private void Conclusion(String teamName){
        TextView teamWinning = (TextView) findViewById(R.id.scores);
        teamWinning.setText(String.valueOf(teamName));
    }

    /**
     * Reset Function
     */
    public void reset(View view){
        String Result = "";
        if(scoreTeamA > scoreTeamB){
            Result = "Team A Wins";
            Conclusion(Result);
        }
        else {
            Result = "Team B Wins";
            Conclusion(Result);
        }
        scoreTeamA = 0;
        scoreTeamB = 0;
        resetMain(scoreTeamA);
    }

    public void resetMain(int score) {
        TextView scoreViewTeamA = (TextView) findViewById(R.id.team_a_score);
        TextView scoreViewTeamB = (TextView) findViewById(R.id.team_b_score);
        scoreViewTeamA.setText(String.valueOf(score));
        scoreViewTeamB.setText(String.valueOf(score));
    }
}
