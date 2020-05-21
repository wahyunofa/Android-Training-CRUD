package com.nopex77.training.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiConfig {
    public static ApiService getApiService(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.42.106/lesKohDerry/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiService service =retrofit.create(ApiService.class);
        return service;
    }
}
