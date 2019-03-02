package com.example.subasri.mcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class shiftReq extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    public String[] shiftTimings={"4am - 10am","10am - 4pm","4pm - 10pm","10pm - 4am"};
    public Spinner spinner1, spinner2, spinner3, spinner4, spinner5, spinner6, spinner7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shift_req);

        spinner1 = (Spinner) findViewById(R.id.spin1);
        spinner1.setOnItemSelectedListener(this);
        spinner2 = (Spinner) findViewById(R.id.spin2);
        spinner2.setOnItemSelectedListener(this);
        spinner3 = (Spinner) findViewById(R.id.spin3);
        spinner3.setOnItemSelectedListener(this);
        spinner4 = (Spinner) findViewById(R.id.spin4);
        spinner4.setOnItemSelectedListener(this);
        spinner5 = (Spinner) findViewById(R.id.spin5);
        spinner5.setOnItemSelectedListener(this);
        spinner6 = (Spinner) findViewById(R.id.spin6);
        spinner6.setOnItemSelectedListener(this);
        spinner7 = (Spinner) findViewById(R.id.spin7);
        spinner7.setOnItemSelectedListener(this);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,shiftTimings);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinner2.setAdapter(adapter);
        spinner3.setAdapter(adapter);
        spinner4.setAdapter(adapter);
        spinner5.setAdapter(adapter);
        spinner6.setAdapter(adapter);
        spinner7.setAdapter(adapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }
    public void onNothingSelected(AdapterView<?> arg0) {

    }

}
