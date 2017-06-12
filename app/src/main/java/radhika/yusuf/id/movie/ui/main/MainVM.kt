package radhika.yusuf.id.movie.ui.main

import android.content.Context
import android.databinding.ObservableField
import radhika.yusuf.id.movie.R

/**
 * Created by Radhika Yusuf on 12/06/17.
 */
class MainVM {

    private var mContext: Context
    var bTitle: ObservableField<String> = ObservableField("")

    constructor(mContext: Context) {
        this.mContext = mContext
        bTitle.set(mContext.getString(R.string.app_name))
    }

}