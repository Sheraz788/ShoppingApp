package com.sheraz.ali.shoppingapp.Controller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.sheraz.ali.shoppingapp.Adapters.ProductAdapter
import com.sheraz.ali.shoppingapp.R
import com.sheraz.ali.shoppingapp.Services.DataService
import com.sheraz.ali.shoppingapp.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    lateinit var  adapter : ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)


        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)

        adapter = ProductAdapter(DataService.getProducts(categoryType), this)
        productsListView.adapter = adapter

        var spanCount = 2
        val orientation = resources.configuration.orientation

        if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if(screenSize > 720){
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        productsListView.layoutManager = layoutManager
    }
}
