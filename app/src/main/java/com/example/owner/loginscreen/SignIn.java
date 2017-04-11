package com.example.owner.loginscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {

    EditText password ;
    Button loginButton ;
    TextView forgotText ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        Intent mainData = getIntent() ;
        if(mainData== null)
            return;
        else {
            String mainsMessage = mainData.getStringExtra("mainMessage");
        }

        loginButton = (Button)findViewById(R.id.loginButton);
        password = (EditText)findViewById(R.id.password) ;
        forgotText = (TextView)findViewById(R.id.forgotText);

    }
}
