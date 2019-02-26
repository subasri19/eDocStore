package com.example.subasri.mcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class empList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emp_list);

        String empList[]={};
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,empList);
        ListView listView = (ListView) findViewById(R.id.lv);
        //listView.setAdapter(empList);

    }
}
