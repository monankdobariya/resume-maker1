package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResumePreviewActivity extends AppCompatActivity {
    TextView txtname, txtaddress, txtemail, txtphone, txtbdate, txtfacebook, txtcourse, txtschool, txtyear, txtcompany, txtjob;
    TextView txtsdate, txtldate, txtskills, txtobjective, txtreference, txttitle, txtemail1, txtphone1,txtcompanyname;

    String name, address, email, phone, Bdate, facebook, course, school, year, company, job, sdate, ldate, skills, objective, reference, title, email1, phone1,companyname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume_preview);
        intiview();


    }

    private void intiview() {
        txtname = findViewById(R.id.txtname);
        txtaddress = findViewById(R.id.txtaddress);
        txtemail = findViewById(R.id.txtemail);
        txtphone = findViewById(R.id.txtphone);
        txtbdate = findViewById(R.id.txtbdate);
        txtfacebook = findViewById(R.id.txtfacebook);
        txtcourse = findViewById(R.id.txtcourse);
        txtschool = findViewById(R.id.txtschool);
        txtyear = findViewById(R.id.txtyear);
        txtcompany = findViewById(R.id.txtcompany);
        txtjob = findViewById(R.id.txtjob);
        txtsdate = findViewById(R.id.txtsdate);
        txtldate = findViewById(R.id.txtldate);
        txtskills = findViewById(R.id.txtskills);
        txtobjective = findViewById(R.id.txtobjective);
        txtreference = findViewById(R.id.txtreference);
        txttitle = findViewById(R.id.txttitle);
        txtemail1 = findViewById(R.id.txtemail1);
        txtphone1 = findViewById(R.id.txtphone1);
        txtcompanyname=findViewById(R.id.txtcompanyname);


        name = getIntent().getStringExtra("name");
        txtname.setText(name);

        address = getIntent().getStringExtra("address");
        txtaddress.setText(address);

        email = getIntent().getStringExtra("email");
        txtemail.setText(email);

        phone = getIntent().getStringExtra("phone");
        txtphone.setText(phone);

        Bdate = getIntent().getStringExtra("Bdate");
        txtbdate.setText(Bdate);

        facebook = getIntent().getStringExtra("facebook");
        txtfacebook.setText(facebook);

        course = getIntent().getStringExtra("course");
        txtcourse.setText(course);

        school = getIntent().getStringExtra("school");
        txtschool.setText(school);

        year = getIntent().getStringExtra("year");
        txtyear.setText(year);

        company = getIntent().getStringExtra("company");
        txtcompany.setText(company);

        job = getIntent().getStringExtra("job");
        txtjob.setText(job);

        sdate = getIntent().getStringExtra("sdate");
        txtsdate.setText(sdate);

        ldate = getIntent().getStringExtra("ldate");
        txtldate.setText(ldate);

        skills = getIntent().getStringExtra("skills");
        txtskills.setText(skills);

        objective = getIntent().getStringExtra("objective");
        txtobjective.setText(objective);

        reference = getIntent().getStringExtra("reference");
        txtreference.setText(reference);

        title = getIntent().getStringExtra("title");
        txttitle.setText(title);


        email1 = getIntent().getStringExtra("email1");
        txtemail1.setText(email1);

        phone1 = getIntent().getStringExtra("phone1");
        txtphone1.setText(phone1);

        companyname =getIntent().getStringExtra("companyname");
        txtcompanyname.setText(companyname);
    }
}