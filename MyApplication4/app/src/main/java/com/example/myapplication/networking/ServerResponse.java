package com.example.myapplication.networking;
import com.google.gson.annotations.SerializedName;


public class ServerResponse {

    // variable name should be same as in the json response from php
    boolean success;
    String message;

    public String getMessage() {
        return message;
    }

    public boolean getSuccess() {
        return success;
    }

}