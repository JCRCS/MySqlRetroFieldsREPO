package com.example.sanros.mysqlretrofitfieldsrepo;

import java.util.List;

import retrofit2.Call;

import retrofit2.http.POST;

/**
 * Created by sanros on 4/08/17.
 */

public interface ApiInterface {

    @POST("readcontacts.php")
    Call<List<Contact>> getContacts();

}