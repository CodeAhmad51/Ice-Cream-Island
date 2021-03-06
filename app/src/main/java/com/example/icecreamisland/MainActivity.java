package com.example.icecreamisland;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button scoop ;
    EditText username , password ;
    TextView forget_password;
    TableDataBase myDataBase;

    SharedPreferences sharedPreferences_credentials ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        scoop = findViewById(R.id.scoop);
        forget_password = findViewById(R.id.forget_password);

        sharedPreferences_credentials = getSharedPreferences("MyPassword" , MODE_PRIVATE);

        scoop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (username.getText().length() == 0 || password.getText().length() == 0){
                    Toast.makeText(getApplicationContext(),"plz enter username & password" , Toast.LENGTH_SHORT).show();
                }
                else{
                    Table table = new Table(username.getText().toString(),password.getText().toString());
                    myDataBase = Room.databaseBuilder(getApplicationContext(),TableDataBase.class,"MyDataBse").allowMainThreadQueries().build();
                    myDataBase.dao().insert(table);

                    saveUsernameData("MyUsername",username.getText().toString());
                    savePasswordData("MyPassword" , password.getText().toString());
                    Intent i = new Intent(getApplicationContext(),LogInHome.class);
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

    /*
    @Override
    protected void onResume() {

        String name = getData("username");
        username.setText(name);
        String password_shared = getPassword("password");
        password.setText(password_shared);
        super.onResume();
    }

     */

    void saveUsernameData(String key , String value){
        SharedPreferences.Editor editor = sharedPreferences_credentials.edit();
        editor.putString(key, value);
        editor.commit();
    }

    String getData(String key){
        String s ;
        s = sharedPreferences_credentials.getString(key , " ");
        return  s ;
    }
    void savePasswordData(String key , String value){
        SharedPreferences.Editor password_prefrence = sharedPreferences_credentials.edit();
        password_prefrence.putString(key, value);
        password_prefrence.commit();
    }

    String getPassword(String key){

        String s ;
        s = sharedPreferences_credentials.getString(key , " ");
        return s ;
    }
}