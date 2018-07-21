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
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Graphic Beanie", "$18", "hat01"),
            Product("Hat Black", "$20", "hat02"),
            Product("Hat White", "17", "hat03"),
            Product("Hat Snapback", "$22","hat04")
    )

    val hoodies = listOf(
            Product("Gray Hoodie", "$22", "hoodie01"),
            Product("Red Hoodie", "$19", "hoodie02"),
            Product("White Hoodie", "$30", "hoodie03"),
            Product("Black Hoodie", "$20", "hoodie04")
    )

    val shirts = listOf(
            Product("Shirt Black", "$25", "shirt01"),
            Product("Badge Light Gray", "$23", "shirt02"),
            Product("Logo Shirt Red", "$30", "shirt03"),
            Product("Hustle", "$15", "shirt04"),
            Product("Kickflip Studios", "$40", "shirt05")
    )
}