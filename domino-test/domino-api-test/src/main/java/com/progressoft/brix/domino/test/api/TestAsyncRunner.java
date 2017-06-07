package com.progressoft.brix.domino.test.api;

import com.progressoft.brix.domino.api.client.async.AsyncRunner;

public class TestAsyncRunner implements AsyncRunner {
    @Override
    public void runAsync(AsyncTask asyncTask) {
        try{
            asyncTask.onSuccess();
        }catch (Exception e){
            asyncTask.onFailed(e);
        }
    }
}
