package com.jaimetoqu.myworld.network;

import android.util.Log;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jaime on 7/15/17.
 */

public class JobsInterceptor {

    public static final String BASE_URL = "https://immense-beyond-53348.herokuapp.com";
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
