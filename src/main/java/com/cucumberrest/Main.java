package com.cucumberrest;

import com.cucumberrest.api.ApiTesting;
import com.cucumberrest.api.models.Location;
import com.cucumberrest.api.models.Response;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class Main {

    public static void main (String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.jsonbin.io/v3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiTesting service = retrofit.create(ApiTesting.class);



//        Call<GetResponse> request = service.getBin(
//                "$2b$10$AYVaJqCoWXJ84akVXK8lxOhdl8F/hf/aXc8P3tt0WZZtvDcBjwQTy",
//                "60815eae56c62a0c0e8a68d5");
//        request.enqueue(new Callback<GetResponse>() {
//
//            @Override
//            public void onResponse(Call<GetResponse> call, Response<GetResponse> response) {
//                Response bin = response.body();
//                int i = 0;
//            }
//
//            @Override
//            public void onFailure(Call<GetResponse> call, Throwable t) {
//                t.printStackTrace();
//            }
//        });



//        Call<DeleteResponse> request = service.deleteBin(
//                "$2b$10$AYVaJqCoWXJ84akVXK8lxOhdl8F/hf/aXc8P3tt0WZZtvDcBjwQTy",
//                "60815eae56c62a0c0e8a68d5");
//        request.enqueue(new Callback<DeleteResponse>() {
//
//            @Override
//            public void onResponse(Call<DeleteResponse> call, Response<DeleteResponse> response) {
//                DeleteResponse person = response.body();
//                int i = 0;
//            }
//
//            @Override
//            public void onFailure(Call<DeleteResponse> call, Throwable t) {
//                t.printStackTrace();
//            }
//        });


        Location location = new Location("Haarlem", "The best street");

        Call<Response> request = service.updateBin(
                "$2b$10$AYVaJqCoWXJ84akVXK8lxOhdl8F/hf/aXc8P3tt0WZZtvDcBjwQTy",
                "60848153f6655022c46aed57",
                location);

        request.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                Response bin = response.body();
                int i = 0;
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                t.printStackTrace();
            }
        });



    }
}
