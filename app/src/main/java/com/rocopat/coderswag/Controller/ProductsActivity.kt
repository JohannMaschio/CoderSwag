package com.rocopat.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.rocopat.coderswag.R
import com.rocopat.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        intent.getStringExtra(EXTRA_CATEGORY)
    }
}
