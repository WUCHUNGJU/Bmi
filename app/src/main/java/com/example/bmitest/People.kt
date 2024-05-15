package com.example.bmitest

class People constructor(val name:String, val weightparm:Float, val heightparm:Float){
   fun bmi():Float
   {val bmi=weightparm/(heightparm*heightparm)
       return  bmi

   }
}