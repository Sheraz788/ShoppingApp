package com.sheraz.ali.shoppingapp.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.sheraz.ali.shoppingapp.Adapters.categoryAdapter
import com.sheraz.ali.shoppingapp.Model.Category
import com.sheraz.ali.shoppingapp.R
import com.sheraz.ali.shoppingapp.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : categoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        adapter = categoryAdapter(this, DataService.categories)

        categoryListView.adapter = adapter


        categoryListView.setOnItemClickListener { adapterView, view, i, l ->

            val category = DataService.categories[i]
            Toast.makeText(this, "You cliced on ${category.title} Cell", Toast.LENGTH_LONG).show()

        }

    }




}
