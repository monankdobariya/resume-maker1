package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    RadioGroup radioGroup;

    CheckBox checkmessage, checkcamera;
    CardView createresume;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        intiview();
    }

    private void intiview() {

        createresume = findViewById(R.id.createresume);
        radioGroup = findViewById(R.id.radioGroup);
        checkmessage = findViewById(R.id.checkmessage);
        checkcamera = findViewById(R.id.checkcamera);

        int selectedId = radioGroup.getCheckedRadioButtonId();

        RadioButton genderradioButton = (RadioButton) findViewById(selectedId);
        if (selectedId == -1) {
            Toast.makeText(HomeActivity.this, "Nothing selected", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(HomeActivity.this, genderradioButton.getText(), Toast.LENGTH_SHORT).show();
        }


        createresume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(HomeActivity.this, PersonalDetailActivity.class);
                startActivity(k);
            }
        });
    }
}

