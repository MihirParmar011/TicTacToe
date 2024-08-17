package com.V.MayurPaksha.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.V.MayurPaksha.tictactoe.game_play;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSGame;

        btnSGame = findViewById(R.id.btnSGame);

        Intent inNext;
        inNext = new Intent(MainActivity.this, game_play.class);

        btnSGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(inNext);

            }
        });

    }
}