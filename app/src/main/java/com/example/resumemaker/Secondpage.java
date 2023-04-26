package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Secondpage extends AppCompatActivity {
    CardView cardbutton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        intview();
    }

    private void intview() {
        cardbutton2 = findViewById(R.id.cardbutton2);

        cardbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(Secondpage.this, thirdpage.class);
                startActivity(b);
            }
        });
    }
}