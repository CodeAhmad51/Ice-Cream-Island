package com.example.icecreamisland;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class ProfilePage extends AppCompatActivity {

    EditText username_profilePage, password_ProfilePage , email_profile;
    Button LogOutButton;
    BottomNavigationView bottomBar;
    TextView ChangePhoto;
    ImageView profile_image_frame;

    SharedPreferences sharedPreferences_profile;
    private final static int RESULT_LOAD_IMAGE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);
        username_profilePage = findViewById(R.id.username_profilePage);
        password_ProfilePage = findViewById(R.id.password_profilePage);
        email_profile = findViewById(R.id.Email_editText);
        LogOutButton = findViewById(R.id.logOutButton);
        ChangePhoto = findViewById(R.id.ChangePhoto);


        sharedPreferences_profile = getSharedPreferences("MyPassword",MODE_PRIVATE);

        username_profilePage.setText(getUsername("MyUsername"));
        password_ProfilePage.setText(getPassword("MyPassword"));
        email_profile.setText(getEmail("email_key"));

        bottomBar = findViewById(R.id.bottom_nav_bar_profile);


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

        LogOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        ChangePhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                Intent i = new Intent(
                        Intent.ACTION_PICK,
                        android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(i , RESULT_LOAD_IMAGE);


            }

        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = { MediaStore.Images.Media.DATA };

            Cursor cursor = getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath = cursor.getString(columnIndex);
            cursor.close();


            profile_image_frame.setImageBitmap(BitmapFactory.decodeFile(picturePath));

        }


    }


    String getUsername(String key){
        String s;
        s = sharedPreferences_profile.getString(key,"");
        return s ;
    }
    String getPassword(String key){
        String password;
        password = sharedPreferences_profile.getString(key,"");
        return password ;
    }
    String getEmail(String key){
        String email;
        email=sharedPreferences_profile.getString(key," ");
        return email;
    }

}