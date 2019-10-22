package app.rxretro.demo.data;

import app.rxretro.demo.data.network.ApiHelper;
import app.rxretro.demo.data.pref.PreferencesHelper;

public interface DataManager extends ApiHelper, PreferencesHelper {

    void logout();
}
