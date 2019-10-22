package app.rxretro.demo.di.components;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import app.rxretro.demo.data.DataManager;
import app.rxretro.demo.di.ApplicationContext;
import app.rxretro.demo.di.modules.ApplicationModule;
import app.rxretro.demo.di.modules.NetworkModule;
import app.rxretro.demo.demorxretro;

@Singleton
@Component(modules={ApplicationModule.class, NetworkModule.class})
public interface ApplicationComponent {


    void inject(demorxretro app);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();

}
