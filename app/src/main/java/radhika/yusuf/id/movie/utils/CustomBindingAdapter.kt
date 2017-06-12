package radhika.yusuf.id.movie.utils

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.squareup.picasso.Picasso

/**
 * Created by Radhika Yusuf on 13/06/17.
 */
object CustomBindingAdapter {

    @JvmStatic
    @BindingAdapter("setImageUrl")
    fun setImageUrl(view: ImageView, url: String){
        Picasso.with(view.context)
                .load(url)
                .into(view)
    }
}