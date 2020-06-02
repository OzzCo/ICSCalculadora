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

    fun sumPressed(view:View){
        model.sumPressed()
        mitexto.text = model.display.toString()
    }

    fun equalsPressed(view :View){
        model.equalsPressed()
        mitexto.text = model.display.toString()
    }

}
