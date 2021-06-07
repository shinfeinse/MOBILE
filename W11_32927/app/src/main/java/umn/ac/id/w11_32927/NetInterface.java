package umn.ac.id.w11_32927;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NetInterface {

    @GET("posts")
    Call<ArrayList<RetrofitModel>> getPosts();
}
