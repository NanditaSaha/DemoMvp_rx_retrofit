package app.rxretro.demo.feature.HomeFragment;

import javax.inject.Inject;

import app.rxretro.demo.data.DataManager;
import app.rxretro.demo.share.baseFragment.BaseFragmentPresenter;

public class HomeFragmentPresenter<V extends HomeFragmentMvpView>extends BaseFragmentPresenter<V> implements HomeFragmentMvpPresenter<V> {

    @Inject
    public HomeFragmentPresenter(DataManager dataManager) {
        super(dataManager);
    }
}
