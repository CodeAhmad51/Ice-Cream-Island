package com.example.icecreamisland;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class HomePage extends AppCompatActivity {

    TextView iceCream_price_1 , iceCream_price_2, iceCream_price_3 ,iceCream_price_4, iceCream_price_5, qnt_1 , qnt_2, qnt_3 , qnt_4 , qnt_5;
    ImageView iceCream_price_remove_1 , iceCream_price_remove_2, iceCream_price_remove_3 ,iceCream_price_remove_4, iceCream_price_remove_5;
    ImageView iceCream_price_add_1 , iceCream_price_add_2, iceCream_price_add_3 , iceCream_price_add_4, iceCream_price_add_5;

    ToggleButton heart_fav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        iceCream_price_1 = findViewById(R.id.icecream_price_1);
        iceCream_price_2 = findViewById(R.id.icecream_price_2);
        iceCream_price_3 = findViewById(R.id.icecream_price_3);
        iceCream_price_4 = findViewById(R.id.icecream_price_4);
        iceCream_price_5 = findViewById(R.id.icecream_price_5);

        heart_fav = findViewById(R.id.heart_fav);


        heart_fav.setChecked(false);
        heart_fav.setBackgroundDrawable(ContextCompat.getDrawable(heart_fav.getContext(), R.drawable.not_favorite_24));

        qnt_1 = findViewById(R.id.qnt_1);
        qnt_2 = findViewById(R.id.qnt_2);
        qnt_3 = findViewById(R.id.qnt_3);
        qnt_4 = findViewById(R.id.qnt_4);
        qnt_5 = findViewById(R.id.qnt_5);

        iceCream_price_add_1 = findViewById(R.id.icecream_add_1);
        iceCream_price_add_2 = findViewById(R.id.icecream_add_2);
        iceCream_price_add_3 = findViewById(R.id.icecream_add_3);
        iceCream_price_add_4 = findViewById(R.id.icecream_add_4);
        iceCream_price_add_5 = findViewById(R.id.icecream_add_5);

        iceCream_price_remove_1 = findViewById(R.id.icecream_remove_1);
        iceCream_price_remove_2 = findViewById(R.id.icecream_remove_2);
        iceCream_price_remove_3 = findViewById(R.id.icecream_remove_3);
        iceCream_price_remove_4 = findViewById(R.id.icecream_remove_4);
        iceCream_price_remove_5 = findViewById(R.id.icecream_remove_5);

       final Float price1 , price2 , price3 , price4 , price5;
        price1 = Float.valueOf(iceCream_price_1.getText().toString());
        price2 = Float.valueOf(iceCream_price_2.getText().toString());
        price3 = Float.valueOf(iceCream_price_3.getText().toString());
        price4 = Float.valueOf(iceCream_price_4.getText().toString());
        price5 = Float.valueOf(iceCream_price_5.getText().toString());

        final int qnt1 , qnt2 , qnt3 , qnt4 , qnt5;

        qnt1 = Integer.valueOf(qnt_1.getText().toString());
        qnt2 = Integer.valueOf(qnt_2.getText().toString());
        qnt3 = Integer.valueOf(qnt_3.getText().toString());
        qnt4 = Integer.valueOf(qnt_4.getText().toString());
        qnt5 = Integer.valueOf(qnt_5.getText().toString());

        iceCream_price_add_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float res ;
                int rslt;

                res = Float.valueOf(iceCream_price_1.getText().toString());
                res = res + price1;
                iceCream_price_1.setText(" " + res);


                rslt = Integer.valueOf(qnt_1.getText().toString());
                rslt +=1;
                qnt_1.setText(""+rslt);

            }
        });

        iceCream_price_remove_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float res;
                int  rslt;


                rslt = Integer.valueOf(qnt_1.getText().toString());
                res = Float.valueOf(iceCream_price_1.getText().toString());

                if(price1<res){
                    res = res - price1;
                    iceCream_price_1.setText(" " + res);

                    rslt= rslt - qnt1;
                    qnt_1.setText(""+rslt);
                }

            }
        });


        iceCream_price_add_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float res;
                int  rslt;

                res = Float.valueOf(iceCream_price_2.getText().toString());
                res = res + price2;
                iceCream_price_2.setText(" "+ res );

                rslt = Integer.valueOf(qnt_2.getText().toString());
                rslt+=1;
                qnt_2.setText(""+rslt);

            }
        });

        iceCream_price_remove_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float res;
                int  rslt;


                rslt = Integer.valueOf(qnt_2.getText().toString());
                res = Float.valueOf(iceCream_price_2.getText().toString());

                if(price2<res){
                    res = res - price2;
                    iceCream_price_2.setText(" " + res);

                    rslt= rslt - qnt2;
                    qnt_2.setText(""+rslt);
                }

            }
        });

        iceCream_price_add_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float res;
                int rslt;

                res = Float.valueOf(iceCream_price_3.getText().toString());
                res = res + price3;
                iceCream_price_3.setText(" "+res);

                rslt = Integer.valueOf(qnt_3.getText().toString());
                rslt +=1;
                qnt_3.setText(""+rslt);

            }
        });

        iceCream_price_remove_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float res;
                int  rslt;


                rslt = Integer.valueOf(qnt_3.getText().toString());
                res = Float.valueOf(iceCream_price_3.getText().toString());

                if(price3<res){
                    res = res - price3;
                    iceCream_price_3.setText(" " + res);

                    rslt= rslt - qnt3;
                    qnt_3.setText(""+rslt);
                }

            }
        });

        iceCream_price_add_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float res;
                int rslt;

                res = Float.valueOf(iceCream_price_4.getText().toString());
                res = res + price4;
                iceCream_price_4.setText(" "+res);

                rslt = Integer.valueOf(qnt_4.getText().toString());
                rslt +=1;
                qnt_4.setText(""+rslt);

            }
        });

        iceCream_price_remove_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float res;
                int  rslt;


                rslt = Integer.valueOf(qnt_4.getText().toString());
                res = Float.valueOf(iceCream_price_4.getText().toString());

                if(price4<res){
                    res = res - price4;
                    iceCream_price_4.setText(" " + res);

                    rslt= rslt - qnt4;
                    qnt_4.setText(""+rslt);
                }

            }
        });


        iceCream_price_add_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float res;
                int rslt;

                res = Float.valueOf(iceCream_price_5.getText().toString());
                res = res + price5;
                iceCream_price_5.setText(" "+res);

                rslt = Integer.valueOf(qnt_5.getText().toString());
                rslt +=1;
                qnt_5.setText(""+rslt);

            }
        });

        iceCream_price_remove_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float res;
                int  rslt;


                rslt = Integer.valueOf(qnt_5.getText().toString());
                res = Float.valueOf(iceCream_price_5.getText().toString());

                if(price5<res){
                    res = res - price5;
                    iceCream_price_5.setText(" " + res);

                    rslt= rslt - qnt5;
                    qnt_5.setText(""+rslt);
                }

            }
        });

        heart_fav.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    heart_fav.setBackgroundDrawable(ContextCompat.getDrawable(heart_fav.getContext(),R.drawable.favorite_pink_24));
                }

                    else{
                    heart_fav.setBackgroundDrawable(ContextCompat.getDrawable(heart_fav.getContext(), R.drawable.not_favorite_24));
                }
            }
        });


    }
}