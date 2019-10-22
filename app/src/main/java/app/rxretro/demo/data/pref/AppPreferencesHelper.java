package app.rxretro.demo.data.pref;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Inject;
import javax.inject.Singleton;

import app.rxretro.demo.di.ApplicationContext;

@Singleton
public class AppPreferencesHelper implements PreferencesHelper {

    private static final String PREF_CURRENT_USER_ID="userid";
    private static final String PREF_CURRENT_USER_EMAIL="userEmail";
    private static final String PREF_CURRENT_USER_PASSWORD="userPassword";
    private static final String PREF_CURRENT_USER_FIRSTNAME="userFirstName";
    private static final String PREF_CURRENT_USER_FULLNAME="userFullName";
    private static final String PREF_CURRENT_USER_LASTNAME="userLastName";
    private static final String PREF_CURRNT_USER_PHONENUMBER="userPhoneNumber";
    private static final String PREF_CURRENT_USER_AGENTID="userAgentId";
    private static final String PREF_CURRENT_USER_GSTNUMBER="userGstNumber";
    public static final String PREF_CART_COUNT="0";
    public static final String PREF_SEARCH="search";
    public static final String PREF_ENQURY_NUMBER="number";
    public static final String PREF_WHATSAPP_NUMBER="number";
    public static final String PREF_CONTACT_NUMBER_ONE="number";
    public static final String PREF_CONTACT_NUMBER_TWO="number";
    public static final String PREF_NOTIFICATION_COUNT="number";


    private final SharedPreferences mPrefs;

    @Inject
    public AppPreferencesHelper(@ApplicationContext Context context) {
        mPrefs = PreferenceManager.getDefaultSharedPreferences(context);
    }

    @Override
    public String getUserId() {
        return null;
    }

    @Override
    public void setUserId(String userId) {

    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public void setEmail(String Email) {

    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public void setFirstName(String FirstName) {

    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public void setLastName(String LastName) {

    }

    @Override
    public String getFullName() {
        return null;
    }

    @Override
    public void setFullName(String FullName) {

    }

    @Override
    public String getPhoneNumber() {
        return null;
    }

    @Override
    public void setPhoneNumber(String PhoneNumber) {

    }

    @Override
    public String getAgentId() {
        return null;
    }

    @Override
    public void setAgentId(String AgentId) {

    }

    @Override
    public String getPassWord() {
        return null;
    }

    @Override
    public void setPassword(String Password) {

    }

    @Override
    public String getCartCount() {
        return null;
    }

    @Override
    public void setCartCount(String cartcount) {

    }

    @Override
    public String getSearch() {
        return null;
    }

    @Override
    public void setSearch(String search) {

    }

    @Override
    public String getEnqury() {
        return null;
    }

    @Override
    public void setEnqury(String enqey) {

    }

    @Override
    public String getWhatsapp() {
        return null;
    }

    @Override
    public void setWhatsapp(String whatsapp) {

    }

    @Override
    public String getGstNumber() {
        return null;
    }

    @Override
    public void setGstNumber(String gstnumber) {

    }
}
