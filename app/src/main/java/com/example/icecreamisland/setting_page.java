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
}