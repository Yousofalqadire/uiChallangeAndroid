package com.example.uichallinge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
  private EditText name,email,website,description;
  private Spinner spinner;
  private RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.name);
        email = (EditText) findViewById(R.id.email);
        website = (EditText) findViewById(R.id.website);
        description = (EditText) findViewById(R.id.description);
        spinner = (Spinner) findViewById(R.id.countries);
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Jordan");
        countries.add("Egypt");
        countries.add("lebanon");
        countries.add("Syria");
        countries.add("Qatar");
        countries.add("Bahrain");
        countries.add("Oman");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_selectable_list_item,
                countries
        );
         spinner.setAdapter(adapter);
        radioGroup = (RadioGroup) findViewById(R.id.radio_group);
     final Button   btn = (Button) findViewById(R.id.registerBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             String _country = spinner.getSelectedItem().toString();
             String _name = name.getText().toString();
             String _email = email.getText().toString();
             String _website = website.getText().toString();
             String _description = description.getText().toString();
             int g = radioGroup.getCheckedRadioButtonId();

             ApplicationUser applicationUser = new ApplicationUser(
                     1,
                     _name,
                     _country,
                     _description,
                     _website,
                     _email
             );
             if(g == R.id.male)
                 applicationUser.setGender("male");
             else if(g == R.id.female)
                 applicationUser.setGender("female");
             else
                 applicationUser.setGender("other");


                System.out.println(applicationUser.getId()+ "\n" +
                     applicationUser.Country + "\n" +
                     applicationUser.Name + "\n"+
                     applicationUser.Email + "\n" +
                     applicationUser.Website + "\n" +
                     applicationUser.Id + "\n" +"\n"
                + applicationUser.getGender());
                Toast.makeText(MainActivity.this,applicationUser.Country,Toast.LENGTH_LONG).show();

            }
        });
    }
}