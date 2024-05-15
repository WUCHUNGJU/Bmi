package com.example.bmitest

class Hello {
}

fun main() {
  val p =Person()
    p.height=1.7f
    p.weight=65.5f
    println(p.bmi())

    val pp=People("JACK",65.5f,1.7f)
    println( pp.bmi())

    val louis=People("Louis",60.0f,1.8f)
    println(louis.name+":"+louis.bmi())
    println(pp.name+":"+pp.bmi())




    p.hello()
   val w=65.5f
    val h=1.7f
    val bmi =w/(h*h)
println("BMI:$bmi")

    /*println("BMI:"+bmi)
    println("Hello Kotlin")
    val age =20  //直接使用Int
    val population= 9999999L
    println(age.inc())
    println(age)


  //Byte   8 bit   -128~127
  //short  16 bit  -32768~32767
  //Int    32 bit  -2147483648~21477483647
  //Long   64 Bit  -9223........
    var name="louis"
    val x = name.get(2)
    println(x)
    name= "fuck"
    println(name)
    // Float 32bit   f
    //Double 64 bit

    val wwww=65.5  //一律使用Double
    val weight:Float=65.5f
    val height=1.7f

    // true false 布寧值
    val xx= true
    val xxx=false

    //Char
    val xy='A'

    //String
    val ass="asffsd"
*/


}