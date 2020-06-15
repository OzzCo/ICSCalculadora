package hn.edu.ujcv.myhelloworldapplication.controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import hn.edu.ujcv.myhelloworldapplication.R
import hn.edu.ujcv.myhelloworldapplication.models.CalculatorModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val model: CalculatorModel = CalculatorModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButtonPressed(view : View){

        mitexto.text = model.display.toString()

    }

    fun onePressed(view : View){
        model.onePressed()
        mitexto.setText( model.display.toString())
    }

    fun twoPressed(view : View){
        model.twoPressed()
        mitexto.setText( model.display.toString())
    }
    fun threePressed(view : View){
        model.threePressed()
        mitexto.setText( model.display.toString())
    }
    fun fourPressed(view : View){
        model.fourPressed()
        mitexto.setText( model.display.toString())
    }
    fun fivePressed(view : View){
        model.fivePressed()
        mitexto.setText( model.display.toString())
    }
    fun sixpressed(view : View){
        model.sixPressed()
        mitexto.setText( model.display.toString())
    }
    fun sevenPressed(view : View){
        model.sevenPressed()
        mitexto.setText( model.display.toString())
    }
    fun eigthPressed(view : View){
        model.eigthPressed()
        mitexto.setText( model.display.toString())
    }
    fun ninePressed(view : View){
        model.ninePressed()
        mitexto.setText( model.display.toString())
    }
    fun zeroPressed(view : View){
        model.zeroPressed()
        mitexto.setText( model.display.toString())
    }

    fun sumPressed(view:View){
        model.sumPressed()
        mitexto.text = model.display.toString()
    }

    fun subtractionPressed(view:View){
        model.subtractionPressed()
        mitexto.text = model.display.toString()
    }
    fun multiplicationPressed(view:View){
        model.multiplicationPressed()
        mitexto.text = model.display.toString()
    }
    fun equalsPressed(view :View){
        model.equalsPressed()
        mitexto.text = model.display.toString()
    }
    fun divisionPressed(view :View){
        model.divisionPressed()
        mitexto.text = model.display.toString()
    }
    fun acPressed(view :View){
        model.acPressed()
        mitexto.text = model.display.toString()
    }

}
