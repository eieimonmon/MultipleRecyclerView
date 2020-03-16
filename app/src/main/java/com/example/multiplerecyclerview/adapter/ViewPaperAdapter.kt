package com.example.multiplerecyclerview.adapter

import android.content.Context
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.example.multiplerecyclerview.R
import com.example.multiplerecyclerview.ViewPaperFragment

class ViewPaperAdapter (private val context: Context, private val imageModelArrayList: ArrayList<ViewPaperFragment>) :
PagerAdapter() {


    private val inflater: LayoutInflater
    init {
        inflater = LayoutInflater.from(context)
    }

    override fun instantiateItem(view: ViewGroup, position: Int): Any {
        val imageLayout = inflater.inflate(R.layout.fragment_view_paper,view,false)!!

        val imageView = imageLayout.findViewById(R.id.imageView) as ImageView


        imageView.setImageResource(imageModelArrayList[position].getImage_drawables())

        view.addView(imageLayout, 0)

        return imageLayout
    }
    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun restoreState(state: Parcelable?, loader: ClassLoader?) {}

    override fun saveState(): Parcelable? {
        return null
    }


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun getCount(): Int {
        return imageModelArrayList.size
    }

}