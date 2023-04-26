package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class thirdpage extends AppCompatActivity {
    CardView cardbutton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdpage);
        initview();
    }

    public void initview() {
        cardbutton3 = findViewById(R.id.cardbutton3);
        cardbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(thirdpage.this, LoginPage.class);
                startActivity(d);
            }
        });
    }
}