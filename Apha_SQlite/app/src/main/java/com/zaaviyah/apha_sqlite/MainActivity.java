package com.zaaviyah.apha_sqlite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1Ad, b2Serach, b3update, b4delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1Ad=(Button)findViewById(R.id.btAdd);
        b2Serach=(Button)findViewById(R.id.btGet);
        b3update=(Button)findViewById(R.id.btUpadte);
        b4delete=(Button)findViewById(R.id.btDelete);

        b1Ad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ADDintent = new Intent(MainActivity.this,AddActivity.class);
                startActivity(ADDintent);
            }
        });
    }


}
