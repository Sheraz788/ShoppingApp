package com.sheraz.ali.shoppingapp.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
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
class CategoryRecyclerAdapter(val context: Context, val categories: List<Category>) : RecyclerView.Adapter<CategoryRecyclerAdapter.Holder>(){

    override fun onBindViewHolder(holder: Holder, position: Int) {

        holder?.bindCategory(categories[position], context)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {

        val convertView = LayoutInflater.from(parent.context).inflate(R.layout.category_list_1, parent, false)

        return Holder(convertView)

    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView) {

        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)

        fun bindCategory (category: Category, context: Context){

            categoryName?.text = category.title
            val resourceID = context.resources.getIdentifier(category.image, "drawable",
                    context.packageName)

            categoryImage?.setImageResource(resourceID)
        }


    }

}