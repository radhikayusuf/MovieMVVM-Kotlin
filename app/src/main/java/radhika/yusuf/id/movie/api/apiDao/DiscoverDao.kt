package radhika.yusuf.id.movie.api.apiDao

/**
 * Created by Radhika Yusuf on 06/06/17.
 */

class DiscoverDao {
    var poster_path: String? = null
    var isAdult: Boolean = false
    var overview: String? = null
    var release_date: String? = null
    var genre_ids: List<Int>? = null
    var id: Int = 0
    var original_title: String? = null
    var original_language: String? = null
    var title: String? = null
    var popularity: Double = 0.toDouble()
    var vote_count: Int = 0
    var isVideo: Boolean = false
    var vote_average: Double = 0.toDouble()
}
