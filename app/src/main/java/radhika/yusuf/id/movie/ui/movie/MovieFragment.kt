package radhika.yusuf.id.movie.ui.movie


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import radhika.yusuf.id.movie.R
import radhika.yusuf.id.movie.api.ApiClient
import radhika.yusuf.id.movie.api.apiDao.BaseApiDao
import radhika.yusuf.id.movie.dao.MovieDao
import radhika.yusuf.id.movie.databinding.FragmentMovieBinding
import radhika.yusuf.id.movie.ui.movie.MovieAdapter
import radhika.yusuf.id.movie.utils.Constants
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


/**
 * A simple [Fragment] subclass.
 */
class MovieFragment : Fragment() {


    var mBinding: FragmentMovieBinding? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_movie, container, false)
        mBinding!!.vm = MovieVM(activity.applicationContext)
        return mBinding!!.root
    }

}

