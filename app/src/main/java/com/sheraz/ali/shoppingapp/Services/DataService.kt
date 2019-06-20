package com.sheraz.ali.shoppingapp.Services

import com.sheraz.ali.shoppingapp.Model.Category
import com.sheraz.ali.shoppingapp.Model.Product

/**
 * Created by Mega Tech on 7/21/2018.
 */
object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Graphic Beanie", "$18", "hat1"),
            Product("Hat Black", "$20", "hat2"),
            Product("Hat White", "17", "hat3"),
            Product("Hat Snapback", "$22","hat4"),
            Product("Graphic Beanie", "$18", "hat1"),
            Product("Hat Black", "$20", "hat2"),
            Product("Hat White", "17", "hat3"),
            Product("Hat Snapback", "$22","hat4"),
            Product("Graphic Beanie", "$18", "hat1"),
            Product("Hat Black", "$20", "hat2"),
            Product("Hat White", "17", "hat3"),
            Product("Hat Snapback", "$22","hat4")
    )

    val hoodies = listOf(
            Product("Gray Hoodie", "$22", "hoodie1"),
            Product("Red Hoodie", "$19", "hoodie2"),
            Product("White Hoodie", "$30", "hoodie3"),
            Product("Black Hoodie", "$20", "hoodie4"),
            Product("Gray Hoodie", "$22", "hoodie1"),
            Product("Red Hoodie", "$19", "hoodie2"),
            Product("White Hoodie", "$30", "hoodie3"),
            Product("Black Hoodie", "$20", "hoodie4"),
            Product("Gray Hoodie", "$22", "hoodie1"),
            Product("Red Hoodie", "$19", "hoodie2"),
            Product("White Hoodie", "$30", "hoodie3"),
            Product("Black Hoodie", "$20", "hoodie4")
    )

    val shirts = listOf(
            Product("Shirt Black", "$25", "shirt1"),
            Product("Badge Light Gray", "$23", "shirt2"),
            Product("Logo Shirt Red", "$30", "shirt3"),
            Product("Hustle", "$15", "shirt4"),
            Product("Kickflip Studios", "$40", "shirt5"),
            Product("Shirt Black", "$25", "shirt1"),
            Product("Badge Light Gray", "$23", "shirt2"),
            Product("Logo Shirt Red", "$30", "shirt3"),
            Product("Hustle", "$15", "shirt4"),
            Product("Kickflip Studios", "$40", "shirt5"),
            Product("Shirt Black", "$25", "shirt1"),
            Product("Badge Light Gray", "$23", "shirt2"),
            Product("Logo Shirt Red", "$30", "shirt3"),
            Product("Hustle", "$15", "shirt4"),
            Product("Kickflip Studios", "$40", "shirt5")
    )


    val digitals = listOf<Product>()


    fun getProducts(category : String) : List<Product>{

        return when(category){
            "SHIRTS" -> shirts
            "HOODIES" -> hoodies
            "HATS" -> hats
            else -> digitals
        }

    }
}