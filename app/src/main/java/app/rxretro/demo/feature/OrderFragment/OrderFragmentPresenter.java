package app.rxretro.demo.feature.OrderFragment;

import javax.inject.Inject;

import app.rxretro.demo.data.DataManager;
import app.rxretro.demo.share.baseFragment.BaseFragmentPresenter;

public class OrderFragmentPresenter<V extends OrderFragmentMvpView> extends BaseFragmentPresenter<V>implements OrderFragmentMvpPresenter<V>{
    @Inject
    public OrderFragmentPresenter(DataManager dataManager) {
        super(dataManager);
    }
}
