package com.example.bansi.tiffin_system;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class producer_item_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producer_item_details);

        Spinner dropdown1 = (Spinner)findViewById(R.id.from_time);
        String[] items1 = new String[]{"00", "01" , "02" , "03","04","05", "06" , "07" , "08","09","10", "11" , "12" , "13","14","15", "16" , "17" , "18","19","20", "21" , "22" , "23"};
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items1);
        dropdown1.setAdapter(adapter1);

        Spinner dropdown2 = (Spinner)findViewById(R.id.to_time);
        String[] items2 = new String[]{"00", "01" , "02" , "03","04","05", "06" , "07" , "08","09","10", "11" , "12" , "13","14","15", "16" , "17" , "18","19","20", "21" , "22" , "23"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        dropdown2.setAdapter(adapter2);

    }
}
