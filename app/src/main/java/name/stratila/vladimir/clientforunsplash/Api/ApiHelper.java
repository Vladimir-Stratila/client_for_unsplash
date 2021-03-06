package name.stratila.vladimir.clientforunsplash.Api;

import android.util.Log;

//import okhttp3.OkHttpClient;
//import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiHelper {
    public  static  final String BASE_URL = "https://api.unsplash.com";
    public  static  final String API_KEY = "PLACE_YOUR_API_KEY_HERE";

    public  static Retrofit retrofit = null;
    public static ApiInterface getApiInterface(){
        if (retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(ApiInterface.class);
    }

}
