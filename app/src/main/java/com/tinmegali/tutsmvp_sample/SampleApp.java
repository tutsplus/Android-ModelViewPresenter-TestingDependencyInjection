package com.tinmegali.tutsmvp_sample;

import android.app.Application;
import android.content.Context;

import com.tinmegali.tutsmvp_sample.di.component.AppComponent;
import com.tinmegali.tutsmvp_sample.di.component.DaggerAppComponent;
import com.tinmegali.tutsmvp_sample.di.module.AppModule;

/**
 * ---------------------------------------------------
 * Created by Tin Megali on 23/03/16.
 * Project: tuts+mvp_sample
 * ---------------------------------------------------
 * <a href="http://www.tinmegali.com">tinmegali.com</a>
 * <a href="http://www.github.com/tinmegali>github</a>
 * ---------------------------------------------------
 */
public class SampleApp extends Application {

    public static SampleApp get(Context context) {
        return (SampleApp) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        initAppComponent();
    }

    private AppComponent appComponent;

    private void initAppComponent(){
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
