package com.example.cww5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText nu = findViewById(R.id.name);
        EditText age = findViewById(R.id.age);
        Button button = findViewById(R.id.button);

        if(nu.getText().toString().equals("")){
            nu.setError("empty name!!!");

        }
        if (age.getText().toString().equals("")){
            age.setError("empty age!!!");
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nu.getText().toString();
                int agee = Integer.parseInt(age.getText().toString());
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name", name );
                intent.putExtra("age", agee);
                startActivity(intent);

            }
        });
    }
}