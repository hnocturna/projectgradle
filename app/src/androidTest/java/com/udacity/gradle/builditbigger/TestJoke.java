package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by hnoct on 2/8/2017.
 */

@RunWith(AndroidJUnit4.class)
public class TestJoke {

    @Test
    public void testVerifyJokeResponse() {
        EndpointAsyncTask asyncTask = new EndpointAsyncTask(new JokeResponse() {
            @Override
            public void getJokeResponse(String joke) {
                assertTrue(joke != null);
            }
        });
        asyncTask.execute();
    }
}
