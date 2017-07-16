package com.jaimetoqu.myworld.network;

import com.jaimetoqu.myworld.models.Job;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by jaime on 7/15/17.
 */

public interface Jobs {

    @GET("/jobs.json")
    Call<List<Job>> get();
}
