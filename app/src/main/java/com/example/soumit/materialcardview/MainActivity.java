package com.example.soumit.materialcardview;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView firstCard, secondCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstCard = (CardView) findViewById(R.id.cardview1_id);
        secondCard = (CardView) findViewById(R.id.cardview2_id);

        firstCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "NewYork City", Snackbar.LENGTH_LONG).show();
            }
        });

        secondCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Times Square", Snackbar.LENGTH_LONG).show();
            }
        });

    }
}
