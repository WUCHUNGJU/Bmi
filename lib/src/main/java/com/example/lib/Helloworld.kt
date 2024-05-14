package com.example.lib

fun main(){
    println("Hello")

    //  val p= Person(65f,1.7f) //第一種寫法
    //  p.bmi();

    var mybmi= getbmi(65F,1.7F)  //第二種寫法
    println("Your BMI is $mybmi")


}

fun getbmi(wpar:Float, hpar:Float):Float
{ var bmi=wpar/(hpar*hpar)
    return bmi

}

class Person(var w:Float,var h:Float)
{fun bmi()
{var bmi=w/(h*h)
    println("Your Bmi is $bmi")


}
}