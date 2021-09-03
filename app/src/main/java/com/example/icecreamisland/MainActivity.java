package com.example.icecreamisland;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button scoop;
    EditText username , password ;
    TextView forget_password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        scoop = findViewById(R.id.scoop);
        forget_password = findViewById(R.id.forget_password);

        scoop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (username.getText().length() == 0 || password.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"plz enter username & password" , Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent i = new Intent(getApplicationContext(),HomePage.class);
                    startActivity(i);
                }

            }
        });

        forget_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),ForgetPage.class);
                startActivity(i);
            }
        });

    }
}