package app.rxretro.demo.feature.LoginOptionPage;

import com.androidnetworking.error.ANError;

import javax.inject.Inject;

import app.rxretro.demo.data.DataManager;
import app.rxretro.demo.data.network.model.Login.LoginResponse;
import app.rxretro.demo.share.base.BasePresenter;
import app.rxretro.demo.utils.rx.SchedulerProvider;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

public class LoginOptionPresenter<V extends LoginOptionMvpView>extends BasePresenter<V> implements LoginOptionMvpPresenter<V> {

    @Inject
    public LoginOptionPresenter(DataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void getLogin(String phone, String password) {
        if (phone == null || phone.isEmpty()) {
            getMvpView().onError("Please Enter phone");
            return;
        }

        if (password == null || password.isEmpty()) {
            getMvpView().onError("Please Enter Password");
            return;
        }
        getMvpView().showLoading();

        getCompositeDisposable().add(getDataManager()
                .doServerLoginApiCall()
                .subscribeOn(getSchedulerProvider().io())
                .observeOn(getSchedulerProvider().ui())
                .subscribe(new Consumer<LoginResponse>() {
                    @Override
                    public void accept(LoginResponse response) throws Exception {


                        if (!isViewAttached()) {
                            return;
                        }

                        getMvpView().hideLoading();
                        getMvpView().successfulltgetResult(response);


                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {

                        if (!isViewAttached()) {
                            return;
                        }
                        getMvpView().hideLoading();

                        if (throwable instanceof ANError) {
                            ANError anError = (ANError) throwable;

                        }
                    }
                }));

    }
}
