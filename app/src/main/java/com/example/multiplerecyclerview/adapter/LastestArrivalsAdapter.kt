package com.example.multiplerecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.multiplerecyclerview.R
import com.example.multiplerecyclerview.model.LastestArrivals
import kotlinx.android.synthetic.main.lastest_arrivals_item.view.*

class LastestArrivalsAdapter(var latestArrivalList: ArrayList<LastestArrivals>):

    RecyclerView.Adapter<LastestArrivalsAdapter.LastestArrivalsViewHolder> (){

    inner class LastestArrivalsViewHolder(itemViw: View):RecyclerView.ViewHolder(itemViw){
        fun bind(lastestArrivals: LastestArrivals) {

            itemView.lastest_arrival_image.setImageResource(lastestArrivals.image)
            itemView.lastest_arrival_name.text = lastestArrivals.name
            itemView.lastest_arrival_model_no.text = lastestArrivals.modelNo
            itemView.lastest_arrival_brand.text = lastestArrivals.brandName
            itemView.rating_bar.numStars = lastestArrivals.ratingBar
            itemView.discount_price.text = lastestArrivals.discountPrice
            itemView.price.text = lastestArrivals.price

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LastestArrivalsViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.lastest_arrivals_item, parent, false)
        return LastestArrivalsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return latestArrivalList.size
    }

    override fun onBindViewHolder(holder: LastestArrivalsViewHolder, position: Int) {
        holder.bind(latestArrivalList[position])
    }

}



