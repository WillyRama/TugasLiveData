package com.willyramad.topicempatlivedata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.willyramad.topicempatlivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var rvProduk : RecyclerView
    lateinit var adapter : ProdukAdapter
    lateinit var ProdukVm : ProdukViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        ProdukVm = ViewModelProvider(this).get(ProdukViewModel::class.java)
        adapter = ProdukAdapter(ArrayList())
        ProdukVm.getproduk()
        ProdukVm.produkList.observe(this, Observer {
            adapter.setDataProduk(it as ArrayList<DataProduk> /* = java.util.ArrayList<com.willyramad.topicempatlivedata.DataProduk> */)
        })
        adapter.onClick = {
            val bundle = Bundle()
            bundle.putSerializable("detail",it)

            val pindah = Intent ( this, DetailActivity::class.java)
                pindah.putExtras(bundle)
                startActivity(pindah)
        }


        binding.rvProduk.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvProduk.adapter = adapter

    }
}