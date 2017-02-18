package com.example.bansi.tiffin_system;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login1 extends AppCompatActivity {

    Button signup;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);

        signup = (Button)findViewById(R.id.link_signup);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login1.this , personal_details.class);
                startActivity(intent);
            }
        });
    }
}
