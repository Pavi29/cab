package com.test.tournest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class customerlogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customerlogin);

        Button loginButton;
        Button signupButton;

        loginButton = (Button)findViewById(R.id.loginbutton);

        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(customerlogin.this,homepage.class);
                startActivity(i);
            }
        });

        signupButton = (Button)findViewById(R.id.signupbutton);

        signupButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent j = new Intent(customerlogin.this,homepage.class);
                startActivity(j);
            }
        });
    }
}
