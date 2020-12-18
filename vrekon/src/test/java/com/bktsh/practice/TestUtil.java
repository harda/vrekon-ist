package com.bktsh.practice;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created on 2017-Feb-16
 */
public class TestUtil {

    public static void prettyString(Object result) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson.toJson(result);
        System.out.println(jsonString);
    }
}
