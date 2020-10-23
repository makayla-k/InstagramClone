package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("u8hWLNHcqstHwShanA934qxJIQCJNau9G2VRcEj1")
                .clientKey("ViLlw0fqFliaPxGtZt0O5eFfD4Qh4QEf6NA1DStI")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
