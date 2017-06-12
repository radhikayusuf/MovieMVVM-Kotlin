package radhika.yusuf.id.movie.api

import radhika.yusuf.id.movie.api.apiDao.BaseApiDao
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Radhika Yusuf on 06/06/17.
 */
interface ApiMovieInterface {

    @GET("discover/movie")
    fun getMovie(@Query("api_key") key: String, @Query("sort_by") sort_by: String): Call<BaseApiDao>

}