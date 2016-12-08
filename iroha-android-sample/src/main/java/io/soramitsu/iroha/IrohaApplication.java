package io.soramitsu.iroha;

import android.app.Application;

import io.soramitsu.irohaandroid.Iroha;

public class IrohaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        new Iroha.Builder()
                .baseUrl("https://example.com")
                .build();
    }

}