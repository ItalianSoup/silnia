package com.example.megakozakapka

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var wynik =0
    var zdjecia = arrayOf(R.drawable.dscf4108, R.drawable.dscf4138, R.drawable.dscf4097,)
    var id_zdjecia = 0

    fun silnia(n: Int):Int{
        if (n>=1) {
            return n*silnia(n-1)
        }
        else{
            return 1
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {  // BUTTON ACTIVITIES
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageView>(R.id.imageView2).setImageResource(zdjecia[0])

        findViewById<Button>(R.id.buttonN).setOnClickListener {
            if (id_zdjecia!=2) {
                id_zdjecia = id_zdjecia + 1
            }
            else{
                id_zdjecia = 0
            }
            findViewById<ImageView>(R.id.imageView2).setImageResource(zdjecia[id_zdjecia])
        }
        findViewById<Button>(R.id.buttonP).setOnClickListener {
            if (id_zdjecia!=0){
                id_zdjecia = id_zdjecia -1
            }
            else{
                id_zdjecia = 2
            }
            findViewById<ImageView>(R.id.imageView2).setImageResource(zdjecia[id_zdjecia])
        }
        findViewById<Button>(R.id.buttonSilnia).setOnClickListener {
            var inputS = findViewById<EditText>(R.id.textinput).text.toString().toInt()
            wynik = silnia(inputS)
            findViewById<TextView>(R.id.printtext).text = wynik.toString()
        }
    }


}
