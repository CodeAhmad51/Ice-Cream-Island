package com.example.icecreamisland;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class HomePage extends AppCompatActivity {

    TextView iceCream_price_1 , iceCream_price_2, iceCream_price_3 , qnt_1 , qnt_2, qnt_3;
    ImageView iceCream_price_remove_1 , iceCream_price_remove_2, iceCream_price_remove_3;
    ImageView iceCream_price_add_1 , iceCream_price_add_2, iceCream_price_add_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        iceCream_price_1 = findViewById(R.id.icecream_price_1);
        iceCream_price_2 = findViewById(R.id.icecream_price_2);
        iceCream_price_3 = findViewById(R.id.icecream_price_3);

        qnt_1 = findViewById(R.id.qnt_1);
        qnt_2 = findViewById(R.id.qnt_2);

        qnt_3 = findViewById(R.id.qnt_3);

        iceCream_price_remove_1 = findViewById(R.id.icecream_add_1);
        iceCream_price_remove_2 = findViewById(R.id.icecream_add_2);
        iceCream_price_remove_3 = findViewById(R.id.icecream_add_3);

        iceCream_price_add_1 = findViewById(R.id.icecream_remove_1);
        iceCream_price_add_2 = findViewById(R.id.icecream_remove_2);
        iceCream_price_add_3 = findViewById(R.id.icecream_remove_3);

       final int price1 , price2 , price3;
        price1 = Integer.valueOf(iceCream_price_1.getText().toString());
        price2 = Integer.valueOf(iceCream_price_2.getText().toString());
        price3 = Integer.valueOf(iceCream_price_3.getText().toString());

        iceCream_price_add_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res;

                res = Integer.valueOf(iceCream_price_1.getText().toString());
                iceCream_price_1.setText(res + price1);
            }
        });

        iceCream_price_add_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res;

                res = Integer.valueOf(iceCream_price_1.getText().toString());
                iceCream_price_1.setText(res + price2);
            }
        });

        iceCream_price_add_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int res;

                res = Integer.valueOf(iceCream_price_1.getText().toString());
                iceCream_price_1.setText(res + price3);

            }
        });

    }
}