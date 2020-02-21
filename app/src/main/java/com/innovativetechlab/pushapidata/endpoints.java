package com.innovativetechlab.pushapidata;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface endpoints {

    @FormUrlEncoded
    @POST("feedback/")
    Call<ResponseBody> feedback(
      @Field("name") String name,
      @Field("gender") String gender,
      @Field("dob") String dob,
      @Field("phone") String phone,
      @Field("email") String email,
      @Field("college") String college,
      @Field("degree") String degree,
      @Field("semester") String semester,
      @Field("altPhone") String altPhone,
      @Field("feedback") String suggestion


    );
}
