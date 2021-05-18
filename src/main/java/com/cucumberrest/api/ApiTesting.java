package com.cucumberrest.api;

import com.cucumberrest.api.models.DeleteResponse;
import com.cucumberrest.api.models.Location;
import com.cucumberrest.api.models.Response;
import retrofit2.Call;
import retrofit2.http.*;

public interface ApiTesting {
    @Headers("Content-Type: application/json")
    @POST("b/")
    Call<Response> createBin(@Header("X-Master-key") String apiKey, @Body Location location);

    @GET("b/{id}")
    Call<Response> getBin(@Header("X-Master-key") String apiKey, @Path("id") String binId);

    @PUT("b/{id}")
    Call<Response> updateBin(@Header("X-Master-key") String apiKey, @Path("id") String binId, @Body Location location);

    @DELETE("b/{id}")
    Call<DeleteResponse> deleteBin(@Header("X-Master-key") String apiKey, @Path("id") String binId);


}
