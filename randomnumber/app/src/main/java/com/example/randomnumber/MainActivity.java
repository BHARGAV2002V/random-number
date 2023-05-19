package com.example.randomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
private Button button_1;
private TextView textView_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_1=findViewById(R.id.button_1);
        textView_1=findViewById(R.id.textView_1);
        button_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                textView_1.setText("Welcome");

                Random r=new Random();
                int num=r.nextInt(90)+1;
                String random_number = String.valueOf(num);
                textView_1.setText(random_number);


            }
        });
    }
}