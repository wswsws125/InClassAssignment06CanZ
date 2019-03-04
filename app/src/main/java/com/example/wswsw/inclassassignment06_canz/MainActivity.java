package com.example.wswsw.inclassassignment06_canz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button launchActivity = (Button) findViewById(R.id.submit_button);
        launchActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);

                //get message from 3 EditText views and 1 CheckBox
                EditText name = (EditText) findViewById(R.id.input_name_view);
                String name1 = name.getText().toString();

                EditText age = (EditText) findViewById(R.id.input_age_view);
                int age1 = Integer.parseInt(age.getText().toString());

                EditText color = (EditText) findViewById(R.id.input_color_view);
                String color1 = color.getText().toString();

                CheckBox amphibian = (CheckBox) findViewById(R.id.is_amphibian);
                boolean amphibian1 = amphibian.isChecked();

                //create a new animal object
                Animal animalObj=new Animal(name1,age1,color1,amphibian1);

                intent.putExtra(Keys.ANIMAL, animalObj);


                startActivity(intent);
            }
        });
    }


}


