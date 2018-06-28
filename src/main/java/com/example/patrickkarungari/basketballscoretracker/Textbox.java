package com.example.patrickkarungari.basketballscoretracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;



public class Textbox extends AppCompatActivity {
    public static final String TEAM_A = "com.example.myfirstapp.MESSAGE";
    public static final String TEAM_B = "com.example.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textbox);
    }


    /**
     * Called when the user taps the Send button
     */

    public void submitTeams(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, DisplayMessageActivity.class);

        EditText editTextA = (EditText) findViewById(R.id.teamA);
        EditText editTextB =(EditText) findViewById(R.id.teamB);

        String messageA = editTextA.getText().toString();
        String messageB = editTextB.getText().toString();

        intent.putExtra(TEAM_A, messageA);
        intent.putExtra(TEAM_B,messageB);

        startActivity(intent);

    }

}