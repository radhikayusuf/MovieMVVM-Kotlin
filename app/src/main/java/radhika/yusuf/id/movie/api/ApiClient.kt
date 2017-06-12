
package radhika.yusuf.id.movie.api

import radhika.yusuf.id.movie.ui.movie.MovieFragment
import radhika.yusuf.id.movie.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Radhika Yusuf on 06/06/17.
 */
object ApiClient {
    fun service(): ApiMovieInterface {
        val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Constants.BASE_URL)
                .build()
        return retrofit.create(ApiMovieInterface::class.java)
    }
}