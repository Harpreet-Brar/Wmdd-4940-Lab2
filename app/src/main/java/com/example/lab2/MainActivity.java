package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = this.findViewById(R.id.draw_button);
        b.setOnClickListener(new View.OnClickListener() {
            String arr[] = {"HEART OF ACE","HEART OF TWO","HEART OF THREE","HEART OF FOUR","HEART OF FIVE","HEART OF SIX","HEART OF SEVEN","HEART OF EIGHT","HEART OF NINE","HEART OF TEN","HEART OF JACK","HEART OF QUEEN","HEART OF KING","SPADE OF ACE","SPADE OF TWO","SPADE OF THREE","SPADE OF FOUR","SPADE OF FIVE","SPADE OF SIX","SPADE OF SEVEN","SPADE OF EIGHT","SPADE OF NINE","SPADE OF TEN","SPADE OF JACK","SPADE OF QUEEN","SPADE OF KING","DIAMOND OF ACE","DIAMOND OF TWO","DIAMOND OF THREE","DIAMOND OF FOUR","DIAMOND OF FIVE","DIAMOND OF SIX","DIAMOND OF SEVEN","DIAMOND OF EIGHT","DIAMOND OF NINE","DIAMOND OF TEN","DIAMOND OF JACK","DIAMOND OF QUEEN","DIAMOND OF KING","CLUB OF ACE","CLUB OF TWO","CLUB OF THREE","CLUB OF FOUR","CLUB OF FIVE","CLUB OF SIX","CLUB OF SEVEN","CLUB OF EIGHT","CLUB OF NINE","CLUB OF TEN","CLUB OF JACK","CLUB OF QUEEN","CLUB OF KING"};

            int count = 52;
            String temp = "null";
            @Override
            public void onClick(View v) {

                Double rand = (Math.random()*(count+1));
                int card = rand.intValue();
                TextView text = findViewById(R.id.textView);
                TextView text2 = findViewById(R.id.textView2);


                if(count > 0)
                {
                    --count;
                }
                else{
                    count = 51;
                }
                text.setText(String.valueOf(arr[card]));
                text2.setText(String.valueOf("Remaining cards : " + count));

                temp = arr[count];
                arr[count] = arr[card];
                arr[card] = temp;





                Toast t = Toast.makeText( MainActivity.this,  "Random Cards", Toast.LENGTH_SHORT);
                t.show();
            }
        });

    }
}
