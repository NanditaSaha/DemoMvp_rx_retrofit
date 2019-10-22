package app.rxretro.demo.feature.LoginOptionPage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import app.rxretro.demo.R;
import app.rxretro.demo.data.network.model.Login.LoginResponse;
import app.rxretro.demo.feature.Dashboard.DashboardActivity;
import app.rxretro.demo.share.base.BaseActivity;

public class LoginOptionActivity extends BaseActivity implements LoginOptionMvpView, View.OnClickListener {



    @Inject
    LoginOptionPresenter<LoginOptionMvpView> presenter;




    @BindView(R.id.phone)
    EditText phone;
    @BindView(R.id.password)
    EditText password;
    @BindView(R.id.btnlogin)
    Button btnlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_option);
        setUnBinder(ButterKnife.bind(this));
        getActivityComponent().inject(this);
        setUp();

    }


    protected void setUp()
    {
        presenter.onAttached(this);

    }



    @Override
    protected void onDestroy() {
        presenter.onDettached();
        super.onDestroy();
    }



    @Override
    public void successfulltgetResult(LoginResponse loginResponse) {

        if(loginResponse.getSuccess().equals("1"))
        {

          if(phone.getText().toString().trim().equals(loginResponse.getUser_phone())&&password.getText().toString().trim().equals(loginResponse.getUser_password()))
          { gotoNext(DashboardActivity.class,null);}
        }
    }

    @OnClick(R.id.btnlogin)
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btnlogin:
                presenter.getLogin(phone.getText().toString().trim(),password.getText().toString().trim());
        }
    }
}
