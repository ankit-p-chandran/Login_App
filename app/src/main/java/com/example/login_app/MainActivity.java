package com.example.login_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String stringEmail,stringPassword,stringUserName;
    EditText etEmail,etPassword, etUserName;
    Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btLogin = findViewById(R.id.btLogin);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etUserName = findViewById(R.id.etUserName);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                stringEmail = etEmail.getText().toString();
                stringPassword = etPassword.getText().toString();
                stringUserName = etUserName.getText().toString();

                if(stringEmail.equals("abcd@gmail.com")  && stringPassword.equals("1234")){
//                    Toast.makeText(MainActivity.this,"Login Success",Toast.LENGTH_SHORT).show();
                    Intent myMovingIndent = new Intent(MainActivity.this,ActivityHome.class);

                    myMovingIndent.putExtra("myKey",stringEmail);
                    myMovingIndent.putExtra("myKey2",stringUserName);

                    startActivity(myMovingIndent);

                }
                else {

                    Toast.makeText(MainActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}