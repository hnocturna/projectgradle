package com.example.hnoct.myapplication.backend;

import com.example.JokeMagician;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyJoke {

    public String getData() {
        JokeMagician jokeMagician = new JokeMagician();
        String myJoke = jokeMagician.getJoke();
        return myJoke;
    }

}