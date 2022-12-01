package com.example.myapplication.GridView

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.R

internal class GridRVAdapter(

    private val courseList: List<GridViewModel>,
    private val context: Context
) :
    BaseAdapter() {

    private var layoutInflater: LayoutInflater? = null
    private lateinit var courseTV: TextView
    private lateinit var courseIV: ImageView

    override fun getCount(): Int {
        return courseList.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    // in below function we are getting individual item of grid view.
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var convertView = convertView

        if (layoutInflater == null) {
            layoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }

        if (convertView == null) {

            convertView = layoutInflater!!.inflate(R.layout.gridview_item, null)
        }

        courseIV = convertView!!.findViewById(R.id.idIVCourse)
        courseTV = convertView!!.findViewById(R.id.idTVCourse)

        courseTV.setText(courseList.get(position).courseName)
        return convertView
    }
}