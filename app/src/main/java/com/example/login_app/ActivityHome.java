package com.example.login_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityHome extends AppCompatActivity {
    String myReacevedEmail,myReacevedUsername;

    TextView txEmail,txUserName,txWelcome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        myReacevedEmail = getIntent().getStringExtra("myKey");
        myReacevedUsername = getIntent().getStringExtra("myKey2");

        txEmail = findViewById(R.id.txEmail);
        txUserName = findViewById(R.id.txUserName);
        txWelcome = findViewById(R.id.txWelcome);

        txEmail.setText(myReacevedEmail);
        txUserName.setText(myReacevedUsername);
        txWelcome.setText("Welcome " + myReacevedUsername);




    }
}