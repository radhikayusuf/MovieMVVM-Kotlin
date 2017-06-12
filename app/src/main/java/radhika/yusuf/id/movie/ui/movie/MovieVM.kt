package radhika.yusuf.id.movie.ui.movie

import android.content.Context
import android.support.v7.widget.GridLayoutManager
import android.widget.Toast
import radhika.yusuf.id.movie.api.ApiClient
import radhika.yusuf.id.movie.api.apiDao.BaseApiDao
import radhika.yusuf.id.movie.dao.MovieDao
import radhika.yusuf.id.movie.ui.movie.MovieAdapter
import radhika.yusuf.id.movie.utils.Constants
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by Radhika Yusuf on 13/06/17.
 */
class MovieVM {

    private var mContext: Context

    var adapter: MovieAdapter? = null
    var mData = ArrayList<MovieDao>()
    var layoutManager: GridLayoutManager

    constructor(mContext: Context) {
        this.mContext = mContext
        layoutManager = GridLayoutManager(mContext, 2)
        adapter = MovieAdapter()
        adapter!!.mData = this.mData
        getData()
    }

    private fun getData() {
        val data = ApiClient.service().getMovie(Constants.API_KEY, "popularity.desc")
        data.enqueue(object : Callback<BaseApiDao> {
            override fun onResponse(call: Call<BaseApiDao>?, response: Response<BaseApiDao>?) {
                for (item in response!!.body().results!!) {
                    mData.add(MovieDao(item.id.toString(), item.title.toString(), item.overview.toString(), item.release_date.toString(), Constants.BASE_POSTER_URL+item.poster_path.toString()))
                }
                adapter!!.notifyDataSetChanged()
            }
            override fun onFailure(call: Call<BaseApiDao>?, t: Throwable?) {
                Toast.makeText(mContext, t!!.message, Toast.LENGTH_SHORT).show()
            }
        })

    }
}