package com.sheraz.ali.shoppingapp.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.sheraz.ali.shoppingapp.Model.Category
import com.sheraz.ali.shoppingapp.R

/**
 * Created by Mega Tech on 7/31/2018.
 */
class CategoryRecyclerAdapter(val context: Context, val categories: List<Category>, val itemClick : (Category) -> Unit) : RecyclerView.Adapter<CategoryRecyclerAdapter.Holder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {

        val view = LayoutInflater.from(context).inflate(R.layout.category_list_1, parent, false)

        return Holder(view, itemClick)
    }

    override fun getItemCount(): Int {

        return categories.count()

    }

    override fun onBindViewHolder(holder: Holder, position: Int) {

        holder.bindCategory(context, categories[position])

    }

    inner class Holder(itemView: View?, val itemClick : (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {

        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)

        fun bindCategory(context: Context, category: Category){

            categoryName?.text = category.title

            val resourceID = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage?.setImageResource(resourceID)

            itemView.setOnClickListener { itemClick(category) }

        }

    }
}