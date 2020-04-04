package com.study.aula1senacpos.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.study.aula1senacpos.R
import com.study.aula1senacpos.model.Car
import kotlinx.android.synthetic.main.item.view.*

class CarsAdapter(private val myDataset: List<Car>) :
    RecyclerView.Adapter<CarsAdapter.MyViewHolder>() {

    class MyViewHolder(val viewRoot: View) : RecyclerView.ViewHolder(viewRoot)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int): CarsAdapter.MyViewHolder {
        val textView = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)

        return MyViewHolder(textView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.viewRoot.txt_detail.text = "${myDataset[position].model} - ${myDataset[position].manufacturer}"
    }

    override fun getItemCount() = myDataset.size
}
