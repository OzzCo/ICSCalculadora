package hn.edu.ujcv.myhelloworldapplication.models


import android.annotation.SuppressLint
import android.widget.Toast
import hn.edu.ujcv.myhelloworldapplication.R


class CalculatorModel {
    //
    //constantes de operaciones
    val none = 0
    val sum = 1
    val subs = 2
    val mul = 4
    val div = 5
    var percent = 6

    // variables que llevan el estado de la calculadora
    var display: Double = 0.0
    var operando1: Double = 0.0
    var operando2: Double = 0.0
    var operacion: Int = 0
    var resultado: Double = 0.0
    var willClear = false
    var dotExistence = false

    fun xd(digit: Double, clear: Boolean = false) {

        if (resultado == 0.0) {
            if (dotExistence) {
                if (willClear) {
                    willClear = false
                    operando1 = display
                    display = digit
                } else {
                    display = digitize(display, digit, true)
                    dotExistence = false
                }
            } else {
                if (willClear) {
                    willClear = false
                    operando1 = display
                    display = digit
                } else {
                    display = digitize(display, digit)
                }
            }
        }

        if (resultado !== 0.0) {
            if (dotExistence) {
                if (willClear) {
                    willClear = false
                   /**/resultado = display
                    display = digit
                } else {
                    display = digitize(display, digit, true)
                    dotExistence = false
                }
            } else {
                if (willClear) {
                    willClear = false
                    operando1 = display
                    display = digit
                } else {
                    acPressed()
                    display = digitize(display, digit)
                }
            }
        }


        }


    //metodos para manipular el estado.
    fun onePressed() {
        xd(1.0)
    }

    fun twoPressed() {
        xd(2.0)
    }

    fun threePressed() {
        xd(3.0)
    }

    fun fourPressed() {
        xd(4.0)
    }

    fun fivePressed() {
        xd(5.0)
    }

    fun sixPressed() {
        xd(6.0)
    }

    fun sevenPressed() {
        xd(7.0)
    }

    fun eigthPressed() {
        xd(8.0)
    }

    fun ninePressed() {
        xd(9.0)
    }

    fun zeroPressed() {
        xd(0.0)
    }

    fun sumPressed() {
        if (resultado !== 0.0) {
            operando1 = display
        }
        operacion = sum
        willClear = true

    }

    fun subtractionPressed() {
        if (resultado !== 0.0) {
            operando1 = display
        }
        operacion = subs
        willClear = true

    }

    fun multiplicationPressed() {
        if (resultado !== 0.0) {
            operando1 = display
        }
        operacion = mul
        willClear = true

    }

    fun divisionPressed() {
        if (resultado !== 0.0) {
            operando1 = display
        }
        operacion = div
        willClear = true

    }

    @SuppressLint("ShowToast")
    fun equalsPressed() {
        operando2 = display;
        if (operacion == percent) {
            resultado = (operando1*operando2)/100
            display = resultado
            valueRest()
        }
        if (operacion == sum) {
            resultado = operando1 + operando2
            display = resultado
            valueRest()
        }
        if (operacion == subs) {
            resultado = operando1 - operando2
            display = resultado
            valueRest()
        }
        if (operacion == mul) {
            resultado = operando1 * operando2
            display = resultado
            valueRest()
        }
        if (operacion == div) {
            if (operando2 !== 0.0) {
                resultado = operando1 / operando2
                display = resultado
                operando2 = 0.0
            } else display = operando1

        }
        valueRest()

    }

    fun acPressed() {
        display = 0.0
        operando1 = 0.0
        operando2 = 0.0
        operacion = 0
        willClear = false
        dotExistence = false
        resultado = 0.0
    }

    fun valueRest() {
        operando1 = 0.0
        operando2 = 0.0
        operacion = 0
        willClear = false;
    }

    fun signPressed() {
        display *= -1
    }

    fun dotPressed() {
        dotExistence = true
        willClear = false
    }

    fun percentagePressed(){
        if (resultado !== 0.0) {
            operando1 = display
        }
        operacion = percent
        willClear = true
    }

    // metodos ayudantes
    fun digitize(numeroActual: Double, digito: Double, dotExistence: Boolean = false): Double {
        if (dotExistence){
            return numeroActual + (digito*0.10)
        }
        return numeroActual * 10 + digito

    }

}