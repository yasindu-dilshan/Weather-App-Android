package com.androidyasindu.weatherapp.Retrofit;

import com.androidyasindu.weatherapp.Retrofit.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {


    @GET("weather?appid=92756c24107bc39dd0a7541f66ba55c5&units=metric")
    Call<Example> getWeatherData(@Query("q") String name);



}