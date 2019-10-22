package app.rxretro.demo.data.network;

import app.rxretro.demo.data.network.model.Login.LoginResponse;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiHelper {

    ApiHeader getApiHeader();



//    @POST("api/login")
//    Observable<LoginResponse> doServerLoginApiCall(@Body LoginRequest request);


    @GET("5dae9856320000ee71d95b0d")
    Observable<LoginResponse> doServerLoginApiCall();

}
