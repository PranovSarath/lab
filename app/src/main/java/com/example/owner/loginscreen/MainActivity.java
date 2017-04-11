package com.example.owner.loginscreen;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etUsername;
    Button loginButton;
    TextView tx1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginButton = (Button) findViewById(R.id.loginButton);
        etUsername = (EditText) findViewById(R.id.etUsername);
       // final String userName = etUsername.getText().toString();


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etUsername.getText().toString().equals("admin@gmail.com")) {
                    Intent i = new Intent(MainActivity.this, SignUp.class);
                    // i.putExtra("mainMessage", userName);
                    startActivity(i);
                }
                else
                    {
                        Intent i = new Intent(MainActivity.this, SignIn.class);
                        startActivity(i);
                    }

            }
        });
    }
}
