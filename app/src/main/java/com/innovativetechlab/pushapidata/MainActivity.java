package com.innovativetechlab.pushapidata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    String name = "hjasgdha";
    String gender = "HASGDH";
    String dob = "1995-01-22";
    String phone= "67164516";
    String email= "HGDAJH";
    String college= "DJHFGJSHAD";
    String degree= "HGJHWEG";
    String semester= "DHFGJSHD";
    String altPhone= "DHJFGJDH";
    String feedback= "FHJGJDSH";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retrofit2.Call<ResponseBody> call=Retroclient.getInstance().getApi().feedback(name,gender,dob,phone,email,college,degree,semester,altPhone,feedback);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try{
                    String s=response.body().string();
                    Toast.makeText(MainActivity.this,s,Toast.LENGTH_LONG).show();
                }catch (IOException e){
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        });
    }

}
