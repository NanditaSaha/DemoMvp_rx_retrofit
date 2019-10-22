package app.rxretro.demo.feature.HomeFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import app.rxretro.demo.R;
import app.rxretro.demo.di.components.ActivityComponent;
import app.rxretro.demo.share.baseFragment.BaseFragment;

public class HomeFragment extends BaseFragment implements HomeFragmentMvpView {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    protected void setUp(View view) {

    }


    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        System.out.println("called items"+" "+param1+" "+param2);
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_home, container, false);
        setUnBinder(ButterKnife.bind(this,v));
        ActivityComponent component = getActivityComponent();
        if (component != null) {
            component.inject(this);
        }

        setUp(v);
        return v;
    }
}
