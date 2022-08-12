package com.example.cww5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView6 = findViewById(R.id.textView6);
        TextView textView7 = findViewById(R.id.textView7);

        Bundle bundle = getIntent().getExtras();

        //name
        String name = bundle.getString("name");
        textView6.setText(name);
        //age
        int age = bundle.getInt("age");
        textView7.setText(String.valueOf(age));
    }
}