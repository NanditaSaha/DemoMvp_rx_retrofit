package app.rxretro.demo.feature.splash;

import android.os.Handler;

import javax.inject.Inject;

import app.rxretro.demo.data.DataManager;
import app.rxretro.demo.share.base.BasePresenter;
import app.rxretro.demo.share.base.MvpView;
import app.rxretro.demo.utils.rx.SchedulerProvider;
import io.reactivex.disposables.CompositeDisposable;

public class SplashPresenter<V extends SplashMvpView & MvpView> extends BasePresenter<V> implements SplashMvpPresenter<V> {

@Inject
    public SplashPresenter(DataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void decideNavigation() {
     Navigate();
    }

    private void Navigate()
    {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                getMvpView().navigateToHOme();
            }
        }, 2000);
    }
}
