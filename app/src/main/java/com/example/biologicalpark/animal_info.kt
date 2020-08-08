package com.example.biologicalpark

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_animal_info.*
import kotlinx.android.synthetic.main.animal_ticket.*
import kotlinx.android.synthetic.main.animal_ticket.ivAnimalImage
import kotlinx.android.synthetic.main.animal_ticket.tvName

class animal_info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_info)
        val bundle: Bundle? = intent.extras
        val name = bundle?.getString("name")
        val infor: String? = bundle?.getString("infor")
        val image = bundle?.getInt("image")
        if (image != null) {
            ivAnimalImage.setImageResource(image)
            tvName.text = name
            tvInfo.text = infor
        }
        tvName.text = name

    }
}