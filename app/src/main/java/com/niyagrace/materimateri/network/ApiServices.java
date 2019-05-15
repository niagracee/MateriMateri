package com.niyagrace.materimateri.network;

import com.niyagrace.materimateri.response.ResponseMateri;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServices {
    //@TIPEMETHOD("API_END_POINT")
    @GET("Materi.php")
    Call<ResponseMateri> request_show_all_materi();
    // <ModelData> nama_method()
}
