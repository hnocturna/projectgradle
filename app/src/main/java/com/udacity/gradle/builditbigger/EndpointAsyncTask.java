package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;

import com.example.hnoct.myapplication.backend.myApi.MyApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;

import java.io.IOException;

/**
 * Created by hnoct on 2/8/2017.
 */

public class EndpointAsyncTask extends AsyncTask<Void, Void, Void> {
    private static MyApi myApi = null;
    private JokeResponse jokeResponse;

    public EndpointAsyncTask(JokeResponse jokeResponse) {
        this.jokeResponse = jokeResponse;
    }

    @Override
    protected Void doInBackground(Void... params) {
        if (myApi == null) {
            MyApi.Builder builder = new MyApi.Builder(
                    AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(),
                    null
            )
                    .setRootUrl("http://104.35.226.167:8080/_ah/api/")
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> request) throws IOException {
                            request.setDisableGZipContent(true);
                        }
                    });
            myApi = builder.build();
        }
        try {
            String joke = myApi.getJoke().execute().getData();
            jokeResponse.getJokeResponse(joke);
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
}
