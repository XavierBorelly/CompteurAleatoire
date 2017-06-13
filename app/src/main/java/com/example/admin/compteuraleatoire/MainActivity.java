package com.example.admin.compteuraleatoire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        int nbAlea = rand.nextInt(12)+1;

        TextView number = (TextView) findViewById(R.id.Number);

        number.setText(nbAlea + "");
    }
}
