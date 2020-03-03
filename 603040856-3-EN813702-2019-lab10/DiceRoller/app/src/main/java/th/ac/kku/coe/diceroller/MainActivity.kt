package th.ac.kku.coe.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice(){
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = Random.nextInt(6)+ 1
        val resultView: ImageView = findViewById(R.id.dice_image)
        resultText.text = randomInt.toString()
        when(randomInt){
            1 -> resultView.setImageResource(R.drawable.dice_1)
            2 -> resultView.setImageResource(R.drawable.dice_2)
            3 -> resultView.setImageResource(R.drawable.dice_3)
            4 -> resultView.setImageResource(R.drawable.dice_4)
            5 -> resultView.setImageResource(R.drawable.dice_5)
            6 -> resultView.setImageResource(R.drawable.dice_6)

        }

    }
}
