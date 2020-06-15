package hn.edu.ujcv.myhelloworldapplication.models

class CalculatorModel {
    //
    //constantes de operaciones
    val none = 0;
    val sum = 1;
    val subs = 2;
    val mul = 4;
    val div = 5;

    // variables que llevan el estado de la calculadora
    var display: Double = 0.0
    var operando1: Double = 0.0
    var operando2: Double = 0.0
    var operacion: Int = 0
    var resultado: Double = 0.0
    var willClear = false;

    fun xd(digit: Double, clear: Boolean =  false){
        when (operacion) {
            none ->if(resultado == 0.0){
                display = digitize(display,digit)
            }else if(resultado !== 0.0) {
                resultado = 0.0
                acPressed()
            }
            else-> {
                if(willClear){
                    willClear = false
                    operando1 = display
                    display = digit
                }else{
                    display = digitize(display,digit)
                }
            }
        }
    }
    //metodos para manipular el estado.
    fun onePressed(){
        xd(1.0)
    }
    fun twoPressed(){
        xd(2.0)
    }
    fun threePressed(){
        xd(3.0)
    }
    fun fourPressed(){
        xd(4.0)
    }
    fun fivePressed(){
        xd(5.0)
    }
    fun sixPressed(){
        xd(6.0)
    }
    fun sevenPressed(){
        xd(7.0)
    }
    fun eigthPressed(){
        xd(8.0)
    }
    fun ninePressed(){
        xd(9.0)
    }
    fun zeroPressed(){
        xd(0.0)
    }


    fun sumPressed(){
        if(resultado !== 0.0){
            operando1 = display
        }
        operacion = sum
        willClear = true

    }

    fun subtractionPressed(){
        if(resultado !== 0.0){
            operando1 = display
        }
        operacion = subs
        willClear = true

    }

    fun multiplicationPressed(){
        if(resultado !== 0.0){
            operando1 = display
        }
        operacion = mul
        willClear = true

    }

    fun divisionPressed(){
        if(resultado !== 0.0){
            operando1 = display
        }
        operacion = div
        willClear = true

    }

    fun equalsPressed(){
            operando2 = display;

        if(operacion == sum){
            resultado = operando1 + operando2
            display = resultado
             valueRest()
        }
        if(operacion == subs){
            resultado = operando1 - operando2
            display = resultado
             valueRest()
        }
        if(operacion == mul){
            resultado = operando1 * operando2
            display = resultado
             valueRest()
        }
        if(operacion == div){
            if (operando2 !== 0.0){
                resultado = operando1 / operando2
            display = resultado
                operando2 = 0.0
            }
            else display = 00000000000000000000.0
        }
         valueRest()

    }

    fun acPressed(){
         display = 0.0
         operando1 = 0.0
         operando2 = 0.0
         operacion=  0
         willClear = false;
    }

    fun valueRest(){
        operando1 = 0.0
        operando2 = 0.0
        operacion=  0
        willClear = false;
    }

    // metodos ayudantes
    fun digitize( numeroActual:Double, digito: Double ) : Double{

        return numeroActual * 10 + digito
    }




}