package com.jaimetoqu.myworld.views.main;

import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.EditText;

import com.jaimetoqu.myworld.R;
import com.jaimetoqu.myworld.adapter.JobsAdapter;
import com.jaimetoqu.myworld.background.GetAllJobs;
import com.jaimetoqu.myworld.models.Job;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private JobsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        recyclerView = (RecyclerView) findViewById(R.id.jobsRv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        EditText search = (EditText) findViewById(R.id.searchEt);

        new GetAJob().execute();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        }
    }

    private class GetAJob extends GetAllJobs {

        @Override
        protected void onPostExecute(List<Job> jobs) {
            if (jobs != null) {
                adapter = new JobsAdapter(jobs, MainActivity.this);
                recyclerView.setAdapter(adapter);
                Log.d("GETAJOB", "SALIO");
            }
        }
    }
}
