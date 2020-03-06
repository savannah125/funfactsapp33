package com.example.funfactsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        text = findViewById(R.id.text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setnewfact();
            }
        });
    }

    public void setnewfact(){
        String[] facts = {"I am over 4 feet", "Vegetables are good for you", "I volunteer at the library",
        "Sugar foods are very bad for you", "The sky is blue","Fire is hot", "Bananas are yellow", "Red is a color",
        " You cannot see air", "Windows can open", "I like to sleep", "I feel great sometimes"};
        Random random = new Random();
        int randomnumber = random.nextInt(facts.length);
        text.setText(facts [randomnumber]);
    }
}
