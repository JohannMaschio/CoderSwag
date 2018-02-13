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
            Category("DIGITAL", "digitalgoodimage")
    )
    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat01"),
            Product("Devslopes hat black", "$19", "hat02"),
            Product("Devslopes hat white", "$20", "hat03"),
            Product("Devslopes hat Snapback", "$21", "hat04")
    )
    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$32", "hoodie01"),
            Product("Devslopes Hoodie Red", "$30", "hoodie02"),
            Product("Devslopes Hoodie white", "$31", "hoodie03"),
            Product("Devslopes Hoodie Blue", "$33", "hoodie04")
    )
    val shirts = listOf(
            Product("Devslopes Shit Black", "$20", "shit01"),
            Product("Devslopes Shit Red", "$25", "shit02"),
            Product("Devslopes Shit Hustle", "$35", "shit03"),
            Product("Devslopes Shit Blue", "$30", "shit04"),
            Product("Devslopes Shit Gray", "$40", "shit05")
    )
}