package com.jaimetoqu.myworld.network;

import android.util.Log;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jaime on 7/15/17.
 */

public class JobsInterceptor {

    public static final String BASE_URL = "http://noborders.herokuapp.com";
    public static final int CODE = 200;

    public Jobs get() {

        Retrofit interceptor = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Jobs request = interceptor.create(Jobs.class);
        Log.d("LOG", String.valueOf(request));
        return request;
    }
}
