package com.innovativetechlab.pushapidata;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Retroclient {
    private static  final String BASE_URL="http://saha2201.pythonanywhere.com/api/";
    private static Retroclient mInstance;
    private  Retrofit retrofit;

    private Retroclient(){
        retrofit=new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static synchronized Retroclient getInstance(){
        if (mInstance==null){
            mInstance=new Retroclient();
        }
        return mInstance;
    }
    public endpoints getApi(){
        return retrofit.create(endpoints.class);
    }
}
