package com.jaimetoqu.myworld.views.selection;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.jaimetoqu.myworld.views.main.MainActivity;
import com.jaimetoqu.myworld.R;

public class SelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        getSupportActionBar().hide();

        TextView job = (TextView) findViewById(R.id.jobTv);
        TextView support = (TextView) findViewById(R.id.supportTv);
        job.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SelectionActivity.this, MainActivity.class));
            }
        });
    }
}
