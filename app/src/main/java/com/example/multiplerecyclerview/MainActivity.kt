package com.example.multiplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.viewpager.widget.ViewPager
import com.example.multiplerecyclerview.adapter.ViewPaperAdapter
import com.viewpagerindicator.CirclePageIndicator
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    private var imageModelArrayList: ArrayList<ViewPaperFragment>? = null

    private val myImageList = intArrayOf(R.drawable.camera, R.drawable.bag, R.drawable.consmetic, R.drawable.shoe1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageModelArrayList = ArrayList()
        imageModelArrayList = populateList()

        init()
    }

    private fun init() {
        mPager = findViewById(R.id.viewPaper) as ViewPager
        mPager!!.adapter = ViewPaperAdapter(this@MainActivity, this.imageModelArrayList!!)

        val indicator = findViewById(R.id.indicator) as CirclePageIndicator

        indicator.setViewPager(mPager)

        val density = resources.displayMetrics.density

        //Set circle indicator radius
        indicator.setRadius(5 * density)

        NUM_PAGES = imageModelArrayList!!.size

        // Auto start of viewpager
        val handler = Handler()
        val Update = Runnable {
            if (currentPage == NUM_PAGES) {
                currentPage = 0
            }
            mPager!!.setCurrentItem(currentPage++, true)
        }
        val swipeTimer = Timer()
        swipeTimer.schedule(object : TimerTask() {
            override fun run() {
                handler.post(Update)
            }
        }, 2000, 2000)

        // Pager listener over indicator
        indicator.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageSelected(position: Int) {
                currentPage = position

            }

            override fun onPageScrolled(pos: Int, arg1: Float, arg2: Int) {

            }

            override fun onPageScrollStateChanged(pos: Int) {

            }
        })

    }

    companion object {

        private var mPager: ViewPager? = null
        private var currentPage = 0
        private var NUM_PAGES = 0
    }


    private fun populateList(): ArrayList<ViewPaperFragment> {

        val list = ArrayList<ViewPaperFragment>()

        for (i in 0..3) {
            val viewPaper = ViewPaperFragment()
            viewPaper.setImage_drawables(myImageList[i])
            list.add(viewPaper)
        }

        return list
    }
}
