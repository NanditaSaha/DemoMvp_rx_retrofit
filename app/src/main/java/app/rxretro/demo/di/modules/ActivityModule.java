package app.rxretro.demo.di.modules;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import dagger.Module;
import dagger.Provides;
import app.rxretro.demo.di.ActivityContext;
import app.rxretro.demo.di.PerActivity;
import app.rxretro.demo.feature.Dashboard.DashboardMvpPresenter;
import app.rxretro.demo.feature.Dashboard.DashboardMvpView;
import app.rxretro.demo.feature.Dashboard.DashboardPresenter;
import app.rxretro.demo.feature.HomeFragment.HomeFragment;
import app.rxretro.demo.feature.LoginOptionPage.LoginOptionMvpPresenter;
import app.rxretro.demo.feature.LoginOptionPage.LoginOptionMvpView;
import app.rxretro.demo.feature.LoginOptionPage.LoginOptionPresenter;
import app.rxretro.demo.feature.splash.SplashMvpPresenter;
import app.rxretro.demo.feature.splash.SplashMvpView;
import app.rxretro.demo.feature.splash.SplashPresenter;
import app.rxretro.demo.utils.rx.AppSchedulerProvider;
import app.rxretro.demo.utils.rx.SchedulerProvider;
import io.reactivex.disposables.CompositeDisposable;

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }


    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }


    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(SplashPresenter<SplashMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    DashboardMvpPresenter<DashboardMvpView> provideDashboardPresenter(DashboardPresenter<DashboardMvpView> presenter) {
        return presenter;
    }


    @Provides
    @PerActivity
    LoginOptionMvpPresenter<LoginOptionMvpView> provideLoginOptionPresenter(LoginOptionPresenter<LoginOptionMvpView> presenter) {
        return presenter;
    }


    @Provides
    @PerActivity
    HomeFragment providesHomeFragment()
    {
        return new HomeFragment();
    }


}
