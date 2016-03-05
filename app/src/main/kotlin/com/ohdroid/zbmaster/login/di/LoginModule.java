package com.ohdroid.zbmaster.login.di;

import android.app.Activity;
import android.content.Context;

import com.ohdroid.zbmaster.di.PerActivityModule;
import com.ohdroid.zbmaster.di.exannotation.PerActivity;
import com.ohdroid.zbmaster.login.presenter.LoginPresenter;
import com.ohdroid.zbmaster.login.presenter.imp.LoginPresenterImp;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ohdroid on 2016/2/28.
 */
@Module
public class LoginModule extends PerActivityModule{

    public LoginModule(Activity activity) {
        super(activity);
    }

    @Provides
    @PerActivity
    public LoginPresenter provideLoginPresenter() {
        return new LoginPresenterImp(provideContext());
    }
}