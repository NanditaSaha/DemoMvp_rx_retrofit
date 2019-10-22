package app.rxretro.demo.di.components;


import dagger.Component;
import app.rxretro.demo.di.PerActivity;
import app.rxretro.demo.di.modules.ActivityModule;
import app.rxretro.demo.feature.Dashboard.DashboardActivity;
import app.rxretro.demo.feature.HomeFragment.HomeFragment;
import app.rxretro.demo.feature.LoginOptionPage.LoginOptionActivity;
import app.rxretro.demo.feature.splash.SplashActivity;

@PerActivity
@Component(dependencies = ApplicationComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(SplashActivity activity);
    void inject(DashboardActivity activity);
    void inject(HomeFragment fragment);
    void inject(LoginOptionActivity activity);
}
