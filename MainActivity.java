package com.example.bansi.tiffin_system;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_producer;
    Button btn_consumer;
    static boolean producer;
    static boolean consumer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_producer = (Button)findViewById(R.id.btn_tiffin_provider);
        btn_consumer = (Button)findViewById(R.id.btn_eater);

        btn_consumer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                producer = false;
                consumer = true;

                Intent intent = new Intent(MainActivity.this , login1.class);
                startActivity(intent);
            }
        });
        btn_producer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                producer = true;
                consumer = false;

                Intent intent = new Intent(MainActivity.this , login1.class);
                startActivity(intent);
            }
        });

    }
}
