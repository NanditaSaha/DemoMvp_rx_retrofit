package app.rxretro.demo.feature.LoginOptionPage;

import app.rxretro.demo.share.base.MvpPresenter;

public interface LoginOptionMvpPresenter<V extends LoginOptionMvpView>extends MvpPresenter<V> {

    void getLogin(String phone, String password);

}
