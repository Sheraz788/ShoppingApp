package com.sheraz.ali.shoppingapp.Adapters

import android.content.Context
import android.media.Image
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

    override fun getView(positon: Int, convertView: View?, parent: ViewGroup?): View {

        val categoriesView: View
        val holder : viewHolder

        if(convertView == null){
            categoriesView = LayoutInflater.from(context).inflate(R.layout.category_list_1, null)
            holder = viewHolder()

            holder.categoryName = categoriesView.findViewById(R.id.categoryName)
            holder.categoryImage = categoriesView.findViewById(R.id.categoryImage)

            categoriesView.tag = holder
        }
        else{
            holder = convertView.tag as viewHolder
            categoriesView = convertView
        }


        val category = categories[positon]

        val resourceID = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceID)

        holder.categoryName?.text = category.title

        return categoriesView
    }

    override fun getItem(position: Int): Any {

        return categories[position]

    }

    override fun getItemId(p0: Int): Long {

        return 0

    }

    override fun getCount(): Int {

        return categories.count()

    }

    private class viewHolder{

        var categoryImage : ImageView? = null
        var categoryName : TextView? = null
    }


}