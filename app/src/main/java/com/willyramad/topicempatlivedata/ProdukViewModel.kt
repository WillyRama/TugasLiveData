package com.willyramad.topicempatlivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProdukViewModel : ViewModel() {
    val list = arrayListOf(
        DataProduk("Baju Astronot", R.drawable.dua , "Detail : Lebar dada = 100KM, Lebar Pinggang = 20Hektar, Panjang Lengan = 20Km, Dapat dipakai 1 RT","Deskripsi : baju ini dirancang bukan untuk dibumi:v", "Harga : 1000Rp"),
        DataProduk("Sepatu", R.drawable.dua , "Detail : Only Size 200, untuk dipakai titan atau sepatu ini peninggalan zaman mega","Deskripsi : Bukan Sepatu Sembarangan:v", "Harga :  1000Rp"),
        DataProduk("Celana", R.drawable.dua , "Detail : Celana karet dapat menampung hingga 100 orang, bahkan mempu menampung rasa kesendirian anda selama ini","Deskripsi : Celana yang Multitasking:v", "Harga : 1000Rp"),
        DataProduk("Laptop", R.drawable.dua , "Detail : Laptop Sungsang laptop selangit harga melorot cocok untuk anda yang sedang mencari ganjal jendela anda yang tidak memiliki engsel","Deskripsi : Laptop Langka yang wajib anda beli:v", "Harga : 1000Rp"),
        DataProduk("Handphone", R.drawable.dua , "Detail : Handphone Oddo hp yang dapat merubah wajah anda menjadi 100 tahun lebih muda karna kemampuan kameranya bahkan dapat melihat anda masih dalam kandungan ibu anda","Deskripsi : Handphone yang berbeda dengan yang lain, dijamin anda akan merasa muantaaaaap:v", "Harga : 1000Rp")
    )
//    livedata
    val produkList : MutableLiveData<List<DataProduk>> = MutableLiveData()
    fun getproduk(){
        produkList.value = list

    }
}