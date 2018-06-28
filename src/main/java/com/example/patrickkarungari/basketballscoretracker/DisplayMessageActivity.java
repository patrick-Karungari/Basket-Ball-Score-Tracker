package com.example.patrickkarungari.basketballscoretracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();

        String messageA = intent.getStringExtra(Textbox.TEAM_A);
        String messageB = intent.getStringExtra(Textbox.TEAM_B);

        TextView textViewA = findViewById(R.id.textViewA);
        textViewA.setText(messageA);

        TextView textViewB = findViewById(R.id.textViewB);
        textViewB.setText(messageB);



    }


    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamB(View v) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamB(View v) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * This method resets the score for Team A and Team B.
     */
    public void resetGame(View v) {
        scoreA = 0;
        scoreB = 0;
        displayResetValues(scoreA, scoreB);
    }

    /**
     * Displays the new Reset values for team A and B
     */
    public void displayResetValues(int scoresA, int scoresB) {
        TextView scoreAView = (TextView) findViewById(R.id.team_a_score);
        scoreAView.setText(String.valueOf(scoresA));

        TextView scoreBView = (TextView) findViewById(R.id.team_b_score);
        scoreBView.setText(String.valueOf(scoresB));
    }

}
