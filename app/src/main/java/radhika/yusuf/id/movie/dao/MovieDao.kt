package radhika.yusuf.id.movie.dao

/**
 * Created by Radhika Yusuf on 02/06/17.
 */
class MovieDao {

    var id: String
    var title: String
    var desc: String
    var date: String
    var img_url: String

    constructor(id: String, title: String, desc: String, date: String, img_url: String) {
        this.id = id
        this.title = title
        this.desc = desc
        this.date = date
        this.img_url = img_url
    }



}