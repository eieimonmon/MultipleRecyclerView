package com.example.multiplerecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerview.R
import com.example.multiplerecyclerview.model.PopularProduct
import kotlinx.android.synthetic.main.lastest_arrivals_item.view.*
import kotlinx.android.synthetic.main.lastest_arrivals_item.view.discount_price
import kotlinx.android.synthetic.main.lastest_arrivals_item.view.price
import kotlinx.android.synthetic.main.lastest_arrivals_item.view.rating_bar
import kotlinx.android.synthetic.main.popular_product.view.*

class PopularProductAdapter (var popularProductList: ArrayList<PopularProduct>):
    RecyclerView.Adapter<PopularProductAdapter.popularProductViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): popularProductViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.popular_product,parent,false)
        return popularProductViewHolder(view)
    }

    override fun getItemCount(): Int {
        return popularProductList.size
    }

    override fun onBindViewHolder(holder: popularProductViewHolder, position: Int) {
        holder.bind(popularProductList[position])
    }

    inner class popularProductViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(popularProduct:PopularProduct){
            itemView.popular_image.setImageResource(popularProduct.image)
            itemView.popular_name.text = popularProduct.name
            itemView.popular_brand.text = popularProduct.brandName
            itemView.rating_bar.numStars = popularProduct.ratingBar
            itemView.discount_price.text = popularProduct.discountPrice
            itemView.price.text = popularProduct.price
        }
    }

}