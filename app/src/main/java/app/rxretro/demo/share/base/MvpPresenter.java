package app.rxretro.demo.share.base;

import com.androidnetworking.error.ANError;

public interface MvpPresenter<V extends MvpView> {

    void onAttached(V mvpView);
    void onDettached();
    void handleApiError(ANError error);
}
