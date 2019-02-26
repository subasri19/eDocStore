package com.example.subasri.mcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signup extends AppCompatActivity {

    public TextView navigate;
    public Button signup;
    public EditText desig;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        navigate = (TextView) findViewById(R.id.li);
        signup = (Button) findViewById(R.id.su);
        desig = (EditText) findViewById(R.id.Edes);

        navigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signup.this, login.class);
                startActivity(intent);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // if(desig.getText().equals("admin")){
                    Intent intent = new Intent(signup.this, addEmp.class);
                    startActivity(intent);
                //}
            }
        });
    }
}
