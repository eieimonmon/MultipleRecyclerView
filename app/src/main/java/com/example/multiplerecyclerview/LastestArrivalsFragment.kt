package com.example.multiplerecyclerview


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.multiplerecyclerview.adapter.LastestArrivalsAdapter
import com.example.multiplerecyclerview.model.LastestArrivals
import kotlinx.android.synthetic.main.fragment_lastest_arrivals.view.*

/**
 * A simple [Fragment] subclass.
 */
class LastestArrivalsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root = inflater.inflate(R.layout.fragment_lastest_arrivals, container, false)

        var lastestList = ArrayList<LastestArrivals>()

        lastestList.add(LastestArrivals(R.drawable.bagone, "Hyde Park", "N41015", "LOUIS VUITION",5,"$25000ks", "$29000ks"))
        lastestList.add(LastestArrivals(R.drawable.shoe2, "Nike Men's", "N41022", "Nike",5,"$30000", "$35000ks"))
        lastestList.add(LastestArrivals(R.drawable.pink, "Horns Pink Long", "N3900", "Lady Gaga",5,"$22000ks", "$25000ks"))
        lastestList.add(LastestArrivals(R.drawable.camera1, "SAMSUNG Camera", "N41115", "LOUIS VUITION",5,"$55000ks", "$60000ks"))

        var lastestArrivalsAdapter = LastestArrivalsAdapter(lastestList)
        root.recyclerLastestArrivals.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false)
        root.recyclerLastestArrivals.adapter = lastestArrivalsAdapter
        return root

    }


}
