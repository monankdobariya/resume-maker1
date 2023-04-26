package com.example.resumemaker;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputEditText;

public class PersonalDetailActivity extends AppCompatActivity {
    TextInputEditText edtname, edtaddress, edtemail1,edtphone1,edtb_date,edtfacebook,edtcourse,edtSchool,edtyear,edtcompany1;
    TextInputEditText edttitle1,edtstartdate,edtenddate,edtskills,edtobjective,edtreferencename,edttitle,edtemail,edtphone,edtcompany;
    ImageView arrow,imgphoto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_detail);
        intiview();
    }

    private void intiview() {
        edtname = findViewById(R.id.edtname);
        arrow = findViewById(R.id.arrow);
        edtaddress = findViewById(R.id.edtaddress);
        edtemail1 = findViewById(R.id.edtemail1);
        edtphone1=findViewById(R.id.edtphone1);
        edtb_date=findViewById(R.id.edtb_date);
        edtfacebook=findViewById(R.id.edtfacebook);
        edtcourse=findViewById(R.id.edtcourse);
        edtSchool=findViewById(R.id.edtSchool);
        edtyear=findViewById(R.id.edtyear);
        edtcompany1=findViewById(R.id.edtcompany1);
        edttitle1=findViewById(R.id.edttitle1);
        edtstartdate=findViewById(R.id.edtstartdate);
        edtenddate=findViewById(R.id.edtenddate);
        edtskills=findViewById(R.id.edtskills);
        edtobjective=findViewById(R.id.edtobjective);
        edtreferencename=findViewById(R.id.edtreferencename);
        edttitle=findViewById(R.id.edttitle);
        edtemail=findViewById(R.id.edtemail);
        edtphone=findViewById(R.id.edtphone);
        edtcompany=findViewById(R.id.edtcompany);

        arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtname.getText().toString();
                String address = edtaddress.getText().toString();
                String email = edtemail1.getText().toString();
                String phone=edtphone1.getText().toString();
                String Bdate=edtb_date.getText().toString();
                String facebook=edtfacebook.getText().toString();
                String course=edtcourse.getText().toString();
                String school=edtSchool.getText().toString();
                String year=edtyear.getText().toString();
                String company=edtcompany1.getText().toString();
                String job=edttitle1.getText().toString();
                String sdate=edtstartdate.getText().toString();
                String ldate=edtenddate.getText().toString();
                String skills=edtskills.getText().toString();
                String objective=edtobjective.getText().toString();
                String reference=edtreferencename.getText().toString();
                String title=edttitle.getText().toString();
                String email1=edtemail.getText().toString();
                String phone1=edtphone.getText().toString();
                String companyname=edtcompany.getText().toString();

                Intent a = new Intent(PersonalDetailActivity.this, ResumePreviewActivity.class);
                a.putExtra("name", name);
                a.putExtra("address", address);
                a.putExtra("email",email);
                a.putExtra("phone",phone);
                a.putExtra("Bdate",Bdate);
                a.putExtra("facebook",facebook);
                a.putExtra("course",course);
                a.putExtra("school",school);
                a.putExtra("year",year);
                a.putExtra("company",company);
                a.putExtra("job",job);
                a.putExtra("sdate",sdate);
                a.putExtra("ldate",ldate);
                a.putExtra("skills",skills);
                a.putExtra("objective",objective);
                a.putExtra("reference",reference);
                a.putExtra("title",title);
                a.putExtra("email1",email1);
                a.putExtra("phone1",phone1);
                a.putExtra("companyname",companyname);
                startActivity(a);


            }
        });
//        imgphoto.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent();
//                i.setType("image/*");
//                i.setAction(Intent.ACTION_GET_CONTENT);
//
//                startActivityForResult(Intent.createChooser(i, "Select Picture"), SELECT_PICTURE);
//            }
//        });
    }
}