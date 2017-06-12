package radhika.yusuf.id.movie.ui.main

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.widget.TextView
import radhika.yusuf.id.movie.R
import radhika.yusuf.id.movie.databinding.ActivityMainBinding
import radhika.yusuf.id.movie.ui.movie.MovieFragment

class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {


    private var mBinding: ActivityMainBinding? = null
    private var movieFragment: MovieFragment? = null
    private var fm: FragmentTransaction? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mBinding!!.vm = MainVM(this)
        initComponent()
    }

    private fun initComponent() {
        movieFragment = supportFragmentManager.findFragmentById(R.id.fragment_movie) as MovieFragment
        fm = supportFragmentManager.beginTransaction()
        fm!!.show(movieFragment)
        mBinding!!.navigation.setOnNavigationItemSelectedListener(this)
    }


    //TODO
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.navigation_home -> {
                return true
            }
            R.id.navigation_dashboard -> {
                return true
            }
            R.id.navigation_notifications -> {
                return true
            }
        }
        return false
    }


}
