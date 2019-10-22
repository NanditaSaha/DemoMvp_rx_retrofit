package app.rxretro.demo.feature.Dashboard;

import javax.inject.Inject;

import app.rxretro.demo.data.DataManager;
import app.rxretro.demo.share.base.BasePresenter;
import app.rxretro.demo.utils.rx.SchedulerProvider;
import io.reactivex.disposables.CompositeDisposable;

public class DashboardPresenter<V extends DashboardMvpView>extends BasePresenter<V>implements DashboardMvpPresenter<V> {

    @Inject
    public DashboardPresenter(DataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}
