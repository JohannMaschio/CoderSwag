package com.rocopat.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.rocopat.coderswag.Model.Category
import com.rocopat.coderswag.R

/**
 * Created by johann on 14/02/18.
 */
class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {

    val context = context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View

        categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
        val categoryImage : ImageView = categoryView.findViewById(R.id.categorieImage)
        val categoryName : TextView = categoryView.findViewById(R.id.CategorieName)
        val category = categories[position]
        val resurceId = context.resources.getIdentifier(category.image, "drawble", context.packageName)
        categoryImage.setImageResource(resurceId)
        categoryName.text = category.title
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

}