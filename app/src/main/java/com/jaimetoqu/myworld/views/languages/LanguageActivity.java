package com.jaimetoqu.myworld.views.languages;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;

import com.jaimetoqu.myworld.R;
import com.jaimetoqu.myworld.views.selection.SelectionActivity;


public class LanguageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_language);
        getSupportActionBar().hide();

        final Spinner spinner = (Spinner) findViewById(R.id.languageSp);
        String[] categories = getResources().getStringArray(R.array.languages);
        final ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, categories);
        spinner.setAdapter(arrayAdapter);
        ImageButton next = (ImageButton) findViewById(R.id.nextIbtn);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LanguageActivity.this, SelectionActivity.class));
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (i != 0) {
                    //
                } else {
                    spinner.setAdapter(arrayAdapter);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }


}
