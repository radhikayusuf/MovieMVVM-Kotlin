package radhika.yusuf.id.movie.ui.movie

import android.content.Context
import android.databinding.ObservableField
import radhika.yusuf.id.movie.dao.MovieDao

/**
 * Created by Radhika Yusuf on 13/06/17.
 */

class MovieRowVM{
    private var mContext: Context

    var bTitle: ObservableField<String> = ObservableField("")
    var bImageUrl: ObservableField<String> = ObservableField("")

    constructor(mContext: Context, data: MovieDao) {
        this.mContext = mContext
        bTitle.set(data.title)
        bImageUrl.set(data.img_url)
    }

}


