package app.rxretro.demo;

import android.app.Application;
import android.content.Context;

import javax.inject.Inject;

import app.rxretro.demo.data.DataManager;
import app.rxretro.demo.di.components.ApplicationComponent;
import app.rxretro.demo.di.components.DaggerApplicationComponent;
import app.rxretro.demo.di.modules.ApplicationModule;
import app.rxretro.demo.di.modules.NetworkModule;
import app.rxretro.demo.utils.AppData;

public class demorxretro extends Application {

    ApplicationComponent applicationComponent;

    @Inject
    DataManager mDataManager;


    @Override
    public void onCreate() {
        super.onCreate();
       // Fabric.with(this, new Crashlytics());




        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .networkModule(new NetworkModule(AppData.BASE_URL)).build();

        applicationComponent.inject(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    public DataManager getDataManager() {
        return mDataManager;
    }


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        /*MultiDex.install(this);*/
    }
}
