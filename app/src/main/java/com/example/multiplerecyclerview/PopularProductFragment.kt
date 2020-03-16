package com.example.multiplerecyclerview


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.multiplerecyclerview.adapter.LastestArrivalsAdapter
import com.example.multiplerecyclerview.adapter.PopularProductAdapter
import com.example.multiplerecyclerview.model.LastestArrivals
import com.example.multiplerecyclerview.model.PopularProduct
import kotlinx.android.synthetic.main.fragment_lastest_arrivals.view.*

/**
 * A simple [Fragment] subclass.
 */
class PopularProductFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root = inflater.inflate(R.layout.fragment_popular_product, container, false)

        var popularList = ArrayList<PopularProduct>()

        popularList.add(PopularProduct(R.drawable.iphone, "iphone 8 plus","Apple",5,"$1200000ks", "$1500000ks"))
        popularList.add(PopularProduct(R.drawable.bed, "GhostBed 11 Inch Cooling Gel Memory Foam..... ", "GhostBed", 5,"$325000ks", "$350000ks"))
        popularList.add(PopularProduct(R.drawable.nintendo, "Nintendo Switch-Neon and Fled Joy-Con", "Nintendo", 5,"$255000ks", "$300000ks"))
        popularList.add(PopularProduct(R.drawable.pink, "Horns Pink Long Sleeve T Shirt", "Belario", 5,"$55000ks","60000ks"))

        var popularProductAdapter = PopularProductAdapter(popularList)
        root.recyclerLastestArrivals.layoutManager = LinearLayoutManager(context)
        root.recyclerLastestArrivals.adapter = popularProductAdapter
        return root
    }


}
