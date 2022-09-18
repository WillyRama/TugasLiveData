package com.willyramad.topicempatlivedata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.willyramad.topicempatlivedata.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    lateinit var binding : ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail)
        val ambildata = intent.getSerializableExtra("detail") as DataProduk
        binding.detail = ambildata

           binding.btnBuy.setOnClickListener {
               val pesan = Intent()
               pesan.setAction(Intent.ACTION_SEND)
               pesan.putExtra(Intent.EXTRA_TEXT, "Apakah Barang ini masih tersedia?"+ " Nama Barang :  ${ambildata.namaproduk} dan Dengan Harga : ${ambildata.hargaProcuk}")
               pesan.setType("text/plain")
               pesan.setPackage("com.whatsapp")
               startActivity(Intent.createChooser(intent, ""))
               startActivity(pesan)
           }

    }
}
