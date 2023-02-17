package com.example.seekbarzadanie

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener

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
        //Deklaracja obrazków
        val o1 = findViewById<ImageView>(R.id.obraz1)
        val o2 = findViewById<ImageView>(R.id.obraz2)
        val o3 = findViewById<ImageView>(R.id.obraz3)

        val o1_poziom = findViewById<SeekBar>(R.id.SeekPoziom1)
        val o2_poziom = findViewById<SeekBar>(R.id.SeekPoziom3)
        val o3_poziom = findViewById<SeekBar>(R.id.SeekPoziom2)

        val o1_pion = findViewById<SeekBar>(R.id.SeekPion1)
        val o2_pion = findViewById<SeekBar>(R.id.SeekPion2)
        val o3_pion = findViewById<SeekBar>(R.id.SeekPion3)
        //Deklaracja przycisku reset
        val reset = findViewById<Button>(R.id.btnReset)
        //Deklaracja progressBarow
        val progress_poziom = findViewById<ProgressBar>(R.id.progressPoziom)
        val progress_pion = findViewById<ProgressBar>(R.id.progressPion)

        reset.setOnClickListener(){
            o1_pion.progress = 0
            o2_pion.progress = 0
            o3_pion.progress = 0

            o1_poziom.progress = 0
            o2_poziom.progress = 0
            o3_poziom.progress = 0
        }
        o1_poziom.setOnSeekBarChangeListener(object:OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar, progres: Int, fromUser: Boolean) {
                val skala = progres / 100f
                o1.scaleX = skala
                zmiana(progress_poziom,sumowaniePoziomu())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {

            }

        })
        o1_pion.setOnSeekBarChangeListener(object:OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar, progres: Int, fromUser: Boolean) {
                val skala = progres / 100f
                o1.scaleX = skala
                zmiana(progress_pion,sumowaniePionu())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {

            }

        })
        o2_poziom.setOnSeekBarChangeListener(object:OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar, progres: Int, fromUser: Boolean) {
                val skala = progres / 100f
                o2.scaleX = skala
                zmiana(progress_poziom,sumowaniePoziomu())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {

            }

        })
        o2_pion.setOnSeekBarChangeListener(object:OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar, progres: Int, fromUser: Boolean) {
                val skala = progres / 100f
                o2.scaleX = skala
                zmiana(progress_pion,sumowaniePionu())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {

            }

        })
        o3_poziom.setOnSeekBarChangeListener(object:OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar, progres: Int, fromUser: Boolean) {
                val skala = progres / 100f
                o3.scaleX = skala
                zmiana(progress_poziom,sumowaniePoziomu())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {

            }

        })
        o3_pion.setOnSeekBarChangeListener(object:OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar, progres: Int, fromUser: Boolean) {
                val skala = progres / 100f
                o3.scaleX = skala
                zmiana(progress_pion,sumowaniePionu())
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {

            }

        })
    }
}