package com.example.day2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button_name;
    private TextView text_name;
    private EditText edit_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_name = (Button) findViewById(R.id.button_name);
        text_name = (TextView) findViewById(R.id.text_name);
        edit_text = (EditText) findViewById(R.id.edit_text);

        button_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edit_text.getText().toString();
                if (name.length() > 0) {
                    Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                    text_name.setText("Hello " +name+ "!Welcome to GVP");
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "enter name", Toast.LENGTH_LONG);
                    toast.show();
                }
            }

        });
    }
}
