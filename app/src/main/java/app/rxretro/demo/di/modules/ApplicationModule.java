package app.rxretro.demo.di.modules;


import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import app.rxretro.demo.data.AppDataManager;
import app.rxretro.demo.data.DataManager;
import app.rxretro.demo.data.pref.AppPreferencesHelper;
import app.rxretro.demo.data.pref.PreferencesHelper;
import app.rxretro.demo.di.ApplicationContext;

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext()
    {
        return mApplication;
    }

    @Provides
    Application provideApplication()
    {
        return mApplication;
    }


    @Singleton
    @Provides
    PreferencesHelper providePrefHelper(AppPreferencesHelper mAppPreferencesHelper){
        return mAppPreferencesHelper;
    }

    @Provides
    @Singleton
    DataManager provideDataManager(AppDataManager appDataManager)
    {return  appDataManager;}
}
