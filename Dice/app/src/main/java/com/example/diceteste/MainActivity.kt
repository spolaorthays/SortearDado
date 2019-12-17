package com.example.diceteste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var btRolar: Button? = null
    var imagem: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getIds()

        btRolar!!.setOnClickListener {
            rolarDado()
        }
    }

    fun getIds(){
        btRolar = findViewById(R.id.bt_roll_dice)
        imagem = findViewById(R.id.dado)
    }

    fun rolarDado(){
        val randomInt = Random.nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_um
            2 -> R.drawable.dice_dois
            3 -> R.drawable.dice_tres
            4 -> R.drawable.dice_quatro
            5 -> R.drawable.dice_cinco
            6 -> R.drawable.dice_seis
            else -> R.drawable.dice_um
        }
        imagem!!.setImageResource(drawableResource)
    }
}
