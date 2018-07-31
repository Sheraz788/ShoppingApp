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
    val categroies = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoriesView : View
        val holder : viewHolder

        if(convertView == null){

            categoriesView = LayoutInflater.from(context).inflate(R.layout.category_list_1, null)

            holder = viewHolder()
            holder.categoryName = categoriesView.findViewById(R.id.categoryName)

            holder.categoryImage = categoriesView.findViewById(R.id.categoryImage)

            println("First Time")
            categoriesView.tag = holder

        }else{

            holder = convertView.tag as viewHolder
            categoriesView = convertView
            println("Recycle")

        }


        val category = categroies[position]

        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)

        holder.categoryName?.text = category.title

        return  categoriesView

    }

    override fun getItem(position: Int): Any {

        return categroies[position]

    }

    override fun getItemId(position: Int): Long {

        return 0

    }

    override fun getCount(): Int {

        return categroies.count()

    }


    private class viewHolder{
        var categoryImage : ImageView? = null
        var categoryName : TextView? = null
    }

}