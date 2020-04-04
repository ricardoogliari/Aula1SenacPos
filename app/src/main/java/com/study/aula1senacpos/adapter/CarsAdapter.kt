package com.study.aula1senacpos.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.study.aula1senacpos.DetalheCarro
import com.study.aula1senacpos.R
import com.study.aula1senacpos.model.Car
import kotlinx.android.synthetic.main.item.view.*

class CarsAdapter(
    private val myDataset: List<Car>,
    private val context: Context) :
    RecyclerView.Adapter<CarsAdapter.MyViewHolder>() {

    class MyViewHolder(val viewRoot: View) : RecyclerView.ViewHolder(viewRoot)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int): CarsAdapter.MyViewHolder {
        val textView = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item, parent, false)

        return MyViewHolder(textView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.viewRoot.txt_detail.text = "${myDataset[position].model} - ${myDataset[position].manufacturer}"
        holder.viewRoot.setOnClickListener {
            context.startActivity(Intent(context, DetalheCarro::class.java))
        }
    }

    override fun getItemCount() = myDataset.size
}
