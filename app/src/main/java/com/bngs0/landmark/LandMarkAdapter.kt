package com.bngs0.landmark

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.IntentCompat
import androidx.recyclerview.widget.RecyclerView
import com.bngs0.landmark.databinding.RecyclerviewRowBinding

class LandMarkAdapter(val landMarkList : ArrayList<LandMark>) : RecyclerView.Adapter<LandMarkAdapter.LandMarkHolder>() {
    class LandMarkHolder (val binding: RecyclerviewRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder( //layout ile bağla
        parent: ViewGroup,
        viewType: Int
    ): LandMarkHolder {
        val binding = RecyclerviewRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandMarkHolder(binding)
    }

    override fun onBindViewHolder( //bağlandıktan sonra ne olacağı
        holder: LandMarkHolder,
        position: Int
    ) {
        holder.binding.rvTextView.text = landMarkList.get(position).name

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailsActivity :: class.java)
            intent.putExtra("landmark",landMarkList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int { //kaç tane data oluştu
        return landMarkList.size
    }
}