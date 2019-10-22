package app.rxretro.demo.feature.splash;

import app.rxretro.demo.di.PerActivity;
import app.rxretro.demo.share.base.MvpPresenter;
import app.rxretro.demo.share.base.MvpView;


@PerActivity
public interface SplashMvpPresenter<V extends SplashMvpView & MvpView> extends MvpPresenter<V> {

    void decideNavigation();
}
