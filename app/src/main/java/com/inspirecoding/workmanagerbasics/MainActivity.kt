package com.inspirecoding.workmanagerbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_orderPizza.setOnClickListener {
            navigateToOrderActivity()
        }
    }

    private fun navigateToOrderActivity()
    {
        val intent = Intent(this, OrderingActivity::class.java)
        startActivity(intent)
    }
}