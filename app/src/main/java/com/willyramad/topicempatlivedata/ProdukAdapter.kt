package com.willyramad.topicempatlivedata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.willyramad.topicempatlivedata.databinding.ItemProdukBinding

class ProdukAdapter(var listProduk : ArrayList<DataProduk>): RecyclerView.Adapter<ProdukAdapter.ViewHolder>() {
    var onClick : ((DataProduk) -> Unit)? = null
    class ViewHolder (var binding : ItemProdukBinding) : RecyclerView.ViewHolder(binding.root){
       fun bind(itemProduk : DataProduk){
           binding.produk = itemProduk
       }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdukAdapter.ViewHolder {
        val view = ItemProdukBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProdukAdapter.ViewHolder, position: Int) {
        holder.bind(listProduk[position])
        holder.itemView.setOnClickListener {
            onClick?.invoke(listProduk[position])
        }
    }

    override fun getItemCount(): Int {
        return listProduk.size
    }
    fun setDataProduk(itemData : ArrayList<DataProduk>){
        this.listProduk = itemData
    }
}