package com.example.icecreamisland;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class setting_page extends AppCompatActivity {

    BottomNavigationView bottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_page);
        bottomBar = findViewById(R.id.bottom_nav_bar_setting);

        bottomBar.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                if (R.id.bottom_profile_icon == item.getItemId()) {

                    Intent p = new Intent(getApplicationContext(), ProfilePage.class);
                    startActivity(p);
                    finish();

                }

                if( R.id.bottom_home_icon == item.getItemId()){

                    Intent h = new Intent(getApplicationContext(),LogInHome.class);
                    startActivity(h);
                    finish();
                }



                if( R.id.bottom_setting_icon == item.getItemId() ) {

                    Intent s = new Intent(getApplicationContext(), setting_page.class);
                    startActivity(s);
                    finish();
                }
                return false;
            }
        });
    }
}