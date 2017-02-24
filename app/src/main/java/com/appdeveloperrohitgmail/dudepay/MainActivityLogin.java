package com.appdeveloperrohitgmail.dudepay;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
    }

    public void log(View v)
    {
        Intent i = new Intent(MainActivityLogin.this, MainActivityLogin_studlogin.class);
        startActivity(i);
    }
}
