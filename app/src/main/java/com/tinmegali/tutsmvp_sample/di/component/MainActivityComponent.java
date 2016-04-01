package com.tinmegali.tutsmvp_sample.di.component;

import com.tinmegali.tutsmvp_sample.di.module.MainActivityModule;
import com.tinmegali.tutsmvp_sample.di.scope.ActivityScope;
import com.tinmegali.tutsmvp_sample.main.activity.view.MainActivity;

import dagger.Subcomponent;

/**
 * ---------------------------------------------------
 * Created by Tin Megali on 23/03/16.
 * Project: tuts+mvp_sample
 * ---------------------------------------------------
 * <a href="http://www.tinmegali.com">tinmegali.com</a>
 * <a href="http://www.github.com/tinmegali>github</a>
 * ---------------------------------------------------
 */
@ActivityScope
@Subcomponent( modules = MainActivityModule.class )
public interface MainActivityComponent {
    MainActivity inject(MainActivity activity);
}
