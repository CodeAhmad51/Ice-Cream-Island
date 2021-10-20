package com.example.icecreamisland;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class ProfilePage extends AppCompatActivity {

    EditText username_profilePage, password_ProfilePage , email_profile;
    BottomNavigationView bottomBar;

    SharedPreferences sharedPreferences_profile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);
        username_profilePage = findViewById(R.id.username_profilePage);
        password_ProfilePage = findViewById(R.id.password_profilePage);
        email_profile = findViewById(R.id.Email_editText);


        sharedPreferences_profile = getSharedPreferences("username_dataBase",MODE_PRIVATE);

        username_profilePage.setText(getUsername("username_key"));
        password_ProfilePage.setText(getPassword("password_key"));
        email_profile.setText(getEmail("email_key"));

        bottomBar.setOnItemReselectedListener(new NavigationBarView.OnItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {



                switch (item.getItemId()){
                    case R.id.bottom_profile_icon:
                        Intent p = new Intent(getApplicationContext(), ProfilePage.class);
                        startActivity(p);
                        break;

                    case R.id.bottom_home_icon:

                        Intent h = new Intent(getApplicationContext(),LogInHome.class);
                        startActivity(h);
                        break;

                    case R.id.bottom_setting_icon:
                        Intent s = new Intent(getApplicationContext(),setting_page.class);
                        startActivity(s);
                        break;
                }
            }
        });


    }


    String getUsername(String key){
        String s;
        s = sharedPreferences_profile.getString(key," ");
        return s ;
    }
    String getPassword(String key){
        String password;
        password = sharedPreferences_profile.getString(key," ");
        return password ;
    }
    String getEmail(String key){
        String email;
        email=sharedPreferences_profile.getString(key," ");
        return email;
    }

}