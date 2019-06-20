package com.sheraz.ali.shoppingapp.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.sheraz.ali.shoppingapp.Model.Product
import com.sheraz.ali.shoppingapp.R

/**
 * Created by Mega Tech on 8/3/2018.
 */
class ProductAdapter(val product: List<Product>, val context: Context) : RecyclerView.Adapter<ProductAdapter.holderView>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): holderView {

        val view = LayoutInflater.from(context).inflate(R.layout.product_list_1, parent, false)
        return holderView(view)

    }

    override fun getItemCount(): Int {

        return product.count()

    }

    override fun onBindViewHolder(holder: holderView, position: Int) {

        holder.bindProduct(product[position], context)

    }


    inner class holderView(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
        val productName = itemView?.findViewById<TextView>(R.id.productName)
        val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)


        fun bindProduct(product: Product, context: Context){

            val resourceID = context.resources.getIdentifier(product.Image, "drawable", context.packageName)
            productImage?.setImageResource(resourceID)
            productName?.text = product.title
            productPrice?.text = product.price

        }

    }

}