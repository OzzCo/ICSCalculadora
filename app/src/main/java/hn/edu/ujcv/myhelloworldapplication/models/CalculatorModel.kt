package hn.edu.ujcv.myhelloworldapplication.models

class CalculatorModel {
    //
    //constantes de operaciones
    val none = 0;
    val sum = 1;
    val resta = 2;
    val mul = 4;

    // variables que llevan el estado de la calculadora
    var display: Double = 0.0
    var operando1: Double = 0.0
    var operando2: Double = 0.0
    var operacion: Int = 0
    var willClear = false;



    //metodos para manipular el estado.
    fun onePressed(){
        if(operacion == none){
           display = digitize(display,1.0)
        }
        if(operacion == sum){
            if(willClear == true){
                willClear = false
                operando1 = display
                display = 1.0
            }else{
                display = digitize(display,1.0)
            }
        }
    }
    fun twoPressed(){
        if(operacion == none){
            display = digitize(display,2.0)
        }
    }

    fun sumPressed(){
        operacion = sum
        willClear = true

    }

    fun equalsPressed(){
        operando2 = display;
        if(operacion == sum){
            operando1 = operando1 + operando2
            display = operando1
        }
    }



    // metodos ayudantes
    fun digitize( numeroActual:Double, digito: Double ) : Double{

        return numeroActual * 10 + digito
    }




}