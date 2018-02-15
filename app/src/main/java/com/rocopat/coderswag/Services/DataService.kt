package com.rocopat.coderswag.Services

import com.rocopat.coderswag.Model.Category
import com.rocopat.coderswag.Model.Product

/**
 * Created by johann on 13/02/18.
 */
object DataService {
    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )
    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat1"),
            Product("Devslopes hat black", "$19", "hat2"),
            Product("Devslopes hat white", "$20", "hat3"),
            Product("Devslopes hat Snapback", "$21", "hat4")
    )
    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$32", "hoodie1"),
            Product("Devslopes Hoodie Red", "$30", "hoodie2"),
            Product("Devslopes Hoodie white", "$31", "hoodie3"),
            Product("Devslopes Hoodie Blue", "$33", "hoodie4")
    )
    val shirts = listOf(
            Product("Devslopes Shit Black", "$20", "shirt1"),
            Product("Devslopes Shit Red", "$25", "shirt2"),
            Product("Devslopes Shit Hustle", "$35", "shirt3"),
            Product("Devslopes Shit Blue", "$30", "shirt4"),
            Product("Devslopes Shit Gray", "$40", "shirt5")
    )
}