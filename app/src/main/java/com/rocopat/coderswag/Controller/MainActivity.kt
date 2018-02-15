package com.rocopat.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.rocopat.coderswag.Adapters.CategoryRecycleAdapter
import com.rocopat.coderswag.R
import com.rocopat.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories)
        listView.adapter = adapter

        val layoutManeger = LinearLayoutManager(this)
        listView.layoutManager = layoutManeger
        listView.hasFixedSize()
    }
}
