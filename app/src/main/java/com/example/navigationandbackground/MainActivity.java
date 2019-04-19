package com.example.navigationandbackground;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.net.PasswordAuthentication;

import javax.xml.validation.Validator;

public class MainActivity extends AppCompatActivity {
    private ImageView Image;
    private EditText UserName;
    private EditText Password;
    private Button LogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Image = (ImageView)findViewById(R.id.imgId);
        UserName = (EditText)findViewById(R.id.etuserName);
        Password = (EditText)findViewById(R.id.etPsw);
        LogIn = (Button)findViewById(R.id.btnLogIn);

        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        validate(UserName.getText().toString(),Password.getText().toString());
            }
        });
    }
    private void validate(String userName, String Password)

         {
        Intent intent = new Intent(MainActivity.this,NavigationPage.class);
startActivity(intent);
    }
}

