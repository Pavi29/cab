package com.test.tournest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class customersignup extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customersignup);

        Button signupbutton;
        Button resetbutton;

        signupbutton = (Button)findViewById(R.id.signupbutton);

        signupbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //Intent i = new Intent(customersignup.this, driversignup.class);
                //startActivity(i);
            }

        });

        resetbutton = (Button)findViewById(R.id.resetbutton);

        resetbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //Intent i = new Intent(customersignup.this, driversignup.class);
                //startActivity(i);
            }

        });
    }
}
