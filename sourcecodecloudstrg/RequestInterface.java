package com.teamalgae.cloudstorage;

import com.teamalgae.cloudstorage.models.ServerRequest;
import com.teamalgae.cloudstorage.models.ServerResponse;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestInterface {

    @POST("CloudStorage/")
    Call<ServerResponse> operation(@Body ServerRequest request);

}