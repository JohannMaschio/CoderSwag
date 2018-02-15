package com.rocopat.coderswag.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.rocopat.coderswag.Adapters.CategoryRecycleAdapter
import com.rocopat.coderswag.R
import com.rocopat.coderswag.Services.DataService
import com.rocopat.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories){ category ->
            val productIntent = Intent(this, ProductsActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.image)
            startActivity(productIntent)
        }
        categoryListView.adapter = adapter

        val layoutManeger = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManeger
        categoryListView.hasFixedSize()
    }
}
