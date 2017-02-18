package com.example.bansi.tiffin_system;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class consumer_Item_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consumer_item_details);

        Spinner dropdown = (Spinner)findViewById(R.id.cuisine_type);
        String[] items = new String[]{"Gujrati", "Panjabi" , "chinese" , "pav-bhaji","chole"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
    }
}
