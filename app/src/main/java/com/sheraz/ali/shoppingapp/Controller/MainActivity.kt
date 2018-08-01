package com.sheraz.ali.shoppingapp.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import android.widget.Toast
import com.sheraz.ali.shoppingapp.Adapters.CategoryRecyclerAdapter
import com.sheraz.ali.shoppingapp.Adapters.categoryAdapter
import com.sheraz.ali.shoppingapp.Model.Category
import com.sheraz.ali.shoppingapp.R
import com.sheraz.ali.shoppingapp.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        adapter = CategoryRecyclerAdapter(this, DataService.categories)

        categoryListView.adapter = adapter


        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)


    }




}
