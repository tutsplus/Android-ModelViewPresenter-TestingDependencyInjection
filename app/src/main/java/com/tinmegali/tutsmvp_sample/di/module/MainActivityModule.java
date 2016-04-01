package com.tinmegali.tutsmvp_sample.di.module;

import com.tinmegali.tutsmvp_sample.di.scope.ActivityScope;
import com.tinmegali.tutsmvp_sample.main.activity.MVP_Main;
import com.tinmegali.tutsmvp_sample.main.activity.model.MainModel;
import com.tinmegali.tutsmvp_sample.main.activity.presenter.MainPresenter;
import com.tinmegali.tutsmvp_sample.main.activity.view.MainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * ---------------------------------------------------
 * Created by Tin Megali on 23/03/16.
 * Project: tuts+mvp_sample
 * ---------------------------------------------------
 * <a href="http://www.tinmegali.com">tinmegali.com</a>
 * <a href="http://www.github.com/tinmegali>github</a>
 * ---------------------------------------------------
 */
@Module
public class MainActivityModule {

    private MainActivity activity;

    public MainActivityModule(MainActivity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    MainActivity providesMainActivity() {
        return activity;
    }

    @Provides
    @ActivityScope
    MVP_Main.ProvidedPresenterOps providedPresenterOps() {
        MainPresenter presenter = new MainPresenter( activity );
        MainModel model = new MainModel( presenter );
        presenter.setModel( model );
        return presenter;
    }

}
