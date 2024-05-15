package com.example.bmitest

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.bmitest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding //
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater) //
        setContentView(binding.root)//

        binding.help.setOnClickListener{
            AlertDialog.Builder(this)
                .setMessage("體重（kg）/身高的平方(m²)")
                .setTitle("BMI說明")
                .setPositiveButton("OK", null)
                //.setNeutralButton("Cancel", null)
                .show()
        }






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    }

    fun bmi(view:View)
    {val weight=binding.edWeight.text.toString().toFloat()
        val height=binding.edHeight.text.toString().toFloat()
        val bmi=weight/(height*height)
        Log.d("BMI",bmi.toString())
        Toast.makeText(this,bmi.toString(),Toast.LENGTH_LONG).show()
        AlertDialog.Builder(this)
            .setMessage(bmi.toString())
            .setTitle("Your BMI")
            .setPositiveButton("OK", null)
            .setNeutralButton("Cancel", null)
            .show()



    }
}