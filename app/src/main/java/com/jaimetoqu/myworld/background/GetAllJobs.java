package com.jaimetoqu.myworld.background;

import android.os.AsyncTask;

import com.jaimetoqu.myworld.models.Job;
import com.jaimetoqu.myworld.network.Jobs;
import com.jaimetoqu.myworld.network.JobsInterceptor;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by jaime on 7/16/17.
 */

public class GetAllJobs extends AsyncTask<String, Void, List<Job>> {

    @Override
    protected List<Job> doInBackground(String... strings) {
        Jobs jobs = new JobsInterceptor().get();
        Call<List<Job>> call = jobs.get();
        try {
            Response<List<Job>> response = call.execute();
            if (JobsInterceptor.CODE == response.code() && response.isSuccessful()) {
                return response.body();
            } else {
                return null;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
