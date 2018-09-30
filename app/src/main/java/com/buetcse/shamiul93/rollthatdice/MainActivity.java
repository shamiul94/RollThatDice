package com.buetcse.shamiul93.rollthatdice;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int diceArray[] = {R.drawable.dice1, R.drawable.dice2,
                R.drawable.dice3,R.drawable.dice4,
                R.drawable.dice5,R.drawable.dice6};

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.dice_sound);
        Button roll = findViewById(R.id.rollingButton);

        final ImageView dice1 = findViewById(R.id.dice1);
        final ImageView dice2 = findViewById(R.id.dice2);

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dice Game", "Button is pressed!");
                Random rand = new Random();
                int a ;

                a = rand.nextInt(6) ;
                dice1.setImageResource(diceArray[a]);

                a = rand.nextInt(6);
                dice2.setImageResource(diceArray[a]);

                mp.start();
            }
        });
    }
}
