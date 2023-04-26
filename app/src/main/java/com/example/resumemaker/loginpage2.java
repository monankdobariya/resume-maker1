package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class loginpage2 extends AppCompatActivity {
    TextInputEditText edtusename, edtpassword;
    CardView cardlogin;
    TextView txtsign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage2);
        initview();
    }

    private void initview() {

        edtusename = findViewById(R.id.edtusename);
        edtpassword = findViewById(R.id.edtpassword);
        cardlogin = findViewById(R.id.cardlogin);
        txtsign = findViewById(R.id.txtsign);

        cardlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username, password;
                username = edtusename.getText().toString();
                password = edtpassword.getText().toString();
                if (username.isEmpty()) {
                    Toast.makeText(loginpage2.this, "Please enter your username", Toast.LENGTH_SHORT).show();
                } else
                {
                    if (password.isEmpty())
                    {
                        Toast.makeText(loginpage2.this, "Please enter your password", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Intent g=new Intent(loginpage2.this,HomeActivity.class);
                        startActivity(g);
                    }
                }
            }
        });
        txtsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(loginpage2.this,RegisterActivity.class);
                startActivity(i);
            }
        });

    }
}