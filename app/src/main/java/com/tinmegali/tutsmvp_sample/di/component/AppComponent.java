package com.tinmegali.tutsmvp_sample.di.component;

import android.app.Application;
import android.content.Context;

import com.tinmegali.tutsmvp_sample.di.module.AppModule;
import com.tinmegali.tutsmvp_sample.di.module.MainActivityModule;
import com.tinmegali.tutsmvp_sample.main.activity.view.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * ---------------------------------------------------
 * Created by Tin Megali on 23/03/16.
 * Project: tuts+mvp_sample
 * ---------------------------------------------------
 * <a href="http://www.tinmegali.com">tinmegali.com</a>
 * <a href="http://www.github.com/tinmegali>github</a>
 * ---------------------------------------------------
 */
@Singleton
@Component( modules = AppModule.class)
public interface AppComponent {
    Application application();
    MainActivityComponent getMainComponent(MainActivityModule module);
}
