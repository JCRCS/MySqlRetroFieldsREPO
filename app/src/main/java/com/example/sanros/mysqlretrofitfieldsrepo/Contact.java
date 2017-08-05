package com.example.sanros.mysqlretrofitfieldsrepo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by sanros on 4/08/17.
 */

public class Contact {
    //need two variables for the jason read name and email
    @SerializedName("name")
    private String Name;
    @SerializedName("email")
    private String Email;

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }
}
