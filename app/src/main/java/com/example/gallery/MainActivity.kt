package com.example.gallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.GridLayout
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.security.KeyStore

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycle)
        val productList = ArrayList<Product>()

        productList.add(Product("https://i.pinimg.com/originals/9e/3a/1c/9e3a1cfb7a471a1ad5904e93ebe8e260.jpg"))
        productList.add(Product("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/bmw-m4-x-kith-production-1-of-150-frozen-black-1-1603393948.jpg"))
        productList.add(Product("https://www.irishtimes.com/polopoly_fs/1.1775840.1398700842!/image/image.jpg_gen/derivatives/ratio_4x3_w1200/image.jpg"))
        productList.add(Product("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/2021-mercedes-amg-c63-mmp-1-1604525617.jpg?crop=0.734xw:1.00xh;0.168xw,0&resize=640:*"))
        productList.add(Product("https://cdn.motor1.com/images/mgl/OOAEl/s1/2020-toyota-camry-awd.jpg"))
        productList.add(Product("https://upload.wikimedia.org/wikipedia/commons/e/e5/1980_-_VAZ_2101.JPG"))
        productList.add(Product("https://djboy.clan.su/_ph/3/2/381846504.jpg"))
        productList.add(Product("https://www.carscoops.com/wp-content/uploads/2020/03/Mercedes-AMG-GT-73-7.jpg"))



//        val adapter = ProductAdapter(productList)
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.adapter = adapter
//        val adapter = adapter(productList, this)
        val adapter = ProductAdapter(productList, this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(this, 2)



    }
}