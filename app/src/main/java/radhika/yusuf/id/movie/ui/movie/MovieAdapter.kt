package radhika.yusuf.id.movie.ui.movie

import android.content.Context
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import radhika.yusuf.id.movie.R
import radhika.yusuf.id.movie.dao.MovieDao
import radhika.yusuf.id.movie.databinding.RowMovieBinding
import radhika.yusuf.id.movie.ui.movie.MovieRowVM

/**
 * Created by Radhika Yusuf on 02/06/17.
 */

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    var mData = ArrayList<MovieDao>()
    var mContext: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder? {
        mContext = parent.context
        return ViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.row_movie, parent, true))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.mLocalBinding.vm = MovieRowVM(mContext!!, mData[position])
    }

    override fun getItemCount(): Int {
        return mData?.size
    }

    inner class ViewHolder(binding: RowMovieBinding) : RecyclerView.ViewHolder(binding.root){
        var mLocalBinding = binding
    }
}
