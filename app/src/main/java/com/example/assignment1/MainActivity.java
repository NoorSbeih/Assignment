package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    private ToggleButton btn1;
    private TextView text1;
    private ToggleButton btn2;
    private TextView text2;

    private ToggleButton btn3;
    private TextView text3;

    private ToggleButton btn4;
    private TextView text4;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.AppTitleimage1);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Uri uri = Uri.parse("https://wepal.net/edu/uploads/books/ps-books/g5/g5p1/english5p1.pdf");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        btn1 = findViewById(R.id.btn1);
        text1 = findViewById(R.id.textoutput);
        btn2 = findViewById(R.id.btn2);
        text2 = findViewById(R.id.textoutput2);
        btn3= findViewById(R.id.btn3);
        text3 = findViewById(R.id.textoutput3);
        btn4 = findViewById(R.id.btn4);
        text4 = findViewById(R.id.textoutput4);


        text1.setMovementMethod(new ScrollingMovementMethod());

        String u1 = "Unit 1 : New friends\n " +
                "Pages: 4-12\n" +
                "Main ideas : greetings, introducing yourself, saying what you like doing\n\n" +
                "Vocabulary:\n" +
                "Parent: الأبوين\n" +
                "Twin: التوأم\n" +
                "Art: فن\n" +
                "Email: بريد إلكتروني\n" +
                "Internet: شبكة الإتصالات\n" +
                "Work: عمل\n" +
                "Class: فئة\n" +
                "Film: فيلم\n" +
                "Cinema: مسرح\n" +
                "Race: سباق\n\n" +
                "Grammar:\n" +
                "Present simple: I work in london" ;
        String u2 = "Unit 2: Our country\n" +
                " pages 12-19\n" +
                "Main ideas: Learning about the present continuous, talking about places\n\n" +
                "Vocabulary:\n" +
                "Mother: الأم\n" +
                "Father: أب\n" +
                "People: الناس\n" +
                "Photo: صورة\n" +
                "Stadium: ملعب\n" +
                "Building: مبنى\n" +
                "Boat: قارب\n" +
                "Cable: سلك\n" +
                "Car: سيارة\n" +
                "Valley: وادي\n" +
                "Famous: مشهور\n" +
                "Hiking: جولة على الأقدام\n" +
                "Wheel: عجلة\n\n" +
                "Grammar:\n" +
                "Present continuous: I am hkikng.";
        String u3 = "Unit 3: Mini-Olympics\n" +
                " Pages 20-27\n" +
                "Main ideas: Talking about positions, using ordinal numbers, talking about sports and positions in races\n\n" +
                "Vocabulary:" +
                "\n First: الأول\n" +
                "Second: الثاني\n" +
                "Third: الثالث\n" +
                "Fourth: الرابع\n" +
                "Fifth: الخامس\n" +
                "Metre: متر\n" +
                "Minute: دقيقة\n\n" +
                "Grammar: \n" +
                "1-Adverbs: quickly, slowly, extremely, frequently, daily\n" +
                "example: A turtle walks very slowly\n" +
                "2-Prepositions: on, in, at, beside, across, from.\n" +
                "example: The supermarket is across the street.";
        String u4 = "Unit 4: Holidays in Palestine\n " +
                "Pages 28-35\n" +
                "Main ideas: linking months of the year to seasons, linking weather to seasons\n\n" +
                "Vocabulary:" +
                "January: كانون الثاني\n" +
                "February: شباط\n" +
                "March: آذار\n" +
                "April: نيسان\n" +
                "May: أيار\n" +
                "June: حزيران\n" +
                "July: تموز\n" +
                "August: آب\n" +
                "September: أيلول\n" +
                "October: تشرين الأول\n" +
                "November: تشرين الثاني\n" +
                "December: كانون الاول\n" +
                "Month: شهر\n" +
                "Year: سنة\n";

        text1.setText(u1);
        text2.setText(u2);
        text3.setText(u3);
        text4.setText(u4);


        btn1.setOnCheckedChangeListener((toggleButton, isChecked) -> {
            if(isChecked)
               text1.setVisibility(View.VISIBLE);
            else
                text1.setVisibility(View.GONE);
        });
        btn2.setOnCheckedChangeListener((toggleButton, isChecked) -> {
            if(isChecked)
               text2.setVisibility(View.VISIBLE);
            else
                text2.setVisibility(View.GONE);
        });
        btn3.setOnCheckedChangeListener((toggleButton, isChecked) -> {
            if(isChecked)
                text3.setVisibility(View.VISIBLE);
            else
                text3.setVisibility(View.GONE);
        });
        btn4.setOnCheckedChangeListener((toggleButton, isChecked) -> {
            if(isChecked)
                text4.setVisibility(View.VISIBLE);
            else
                text4.setVisibility(View.GONE);
        });






    }
}