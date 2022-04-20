package com.project.diceapp

class Inheritance {

    fun main(){
        // two objects created
        val ferarri = FastCar("Red","Ferarri")
        println(ferarri)

        val bugatti = FastCar("Blue","Bugatti")
        println(bugatti)



    }




}
// abstract car class
abstract class Car(
    open val color : String,
    open val name : String) {

    // Cost function
    fun Cost( cost : Int) {
        return println("The cost is${cost}")
    }
}
//sub class inheriting from abstract car class
class FastCar(override val color: String, override val name: String) : Car(color, name) {
    init {
        println("The color is ${color}")
        println("The name is ${name}")
    }

}