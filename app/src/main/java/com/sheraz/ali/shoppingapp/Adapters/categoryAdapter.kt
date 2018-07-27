package com.sheraz.ali.shoppingapp.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.sheraz.ali.shoppingapp.Model.Category
import com.sheraz.ali.shoppingapp.R

/**
 * Created by Mega Tech on 7/22/2018.
 */
class categoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView : View
        val holder: viewHolder

        if(convertView == null){
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_1, null)
            holder = viewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)

            categoryView.tag = holder
        }else{

            holder = convertView.tag as viewHolder
            categoryView = convertView

        }

        val category = categories[position]

        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        println(resourceId)
        holder.categoryName?.text = category.title

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {

        return 0

    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class viewHolder{
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }

}