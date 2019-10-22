package app.rxretro.demo.feature.LoginOptionPage;

import app.rxretro.demo.data.network.model.Login.LoginResponse;
import app.rxretro.demo.share.base.MvpView;

public interface LoginOptionMvpView extends MvpView {

    void successfulltgetResult(LoginResponse loginResponse);
}
