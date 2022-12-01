package com.example.myapplication.GridView
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.example.myapplication.databinding.AdminStartsGameActivityBinding
import kotlin.collections.ArrayList
class AdminStartedGameActivity:AppCompatActivity() {
    private lateinit var binding:AdminStartsGameActivityBinding
    lateinit var courseGRV: GridView
    lateinit var courseList: List<GridViewModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= AdminStartsGameActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        courseGRV = findViewById(R.id.idGRV)
        courseList = ArrayList<GridViewModel>()

        val courseAdapter = GridRVAdapter(courseList = courseList, this@AdminStartedGameActivity)

        courseGRV.adapter = courseAdapter


        courseGRV.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->

            Toast.makeText(
                applicationContext, courseList[position].courseName + " selected",
                Toast.LENGTH_SHORT
            ).show()
        }

    }
}