package com.example.seekbarzadanie

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    fun sumowaniePoziomu(): Int{
        val poziom_obraz1 = findViewById<SeekBar>(R.id.SeekPoziom1)
        val poziom_obraz2 = findViewById<SeekBar>(R.id.SeekPoziom2)
        val poziom_obraz3 = findViewById<SeekBar>(R.id.SeekPoziom3)
        val sumowanie= poziom_obraz1.progress + poziom_obraz2.progress + poziom_obraz3.progress
        return sumowanie
    }
    fun sumowaniePionu(): Int{
        val pion_obraz1 = findViewById<SeekBar>(R.id.SeekPion1)
        val pion_obraz2 = findViewById<SeekBar>(R.id.SeekPion2)
        val pion_obraz3 = findViewById<SeekBar>(R.id.SeekPion3)
        val sumowanie = pion_obraz1.progress + pion_obraz2.progress + pion_obraz3.progress
        return sumowanie
    }
    fun zmiana(progressBar: ProgressBar , suma:Int){
        progressBar.progress = suma/3
    }
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}