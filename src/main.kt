fun main() {
    var car = Car("SUbaru", "KCR759L", "grey", 5)
    car.carry(5)
    car.identity()


}
//create a class car with the following attributes:make,model,color,capacity and has 3  functions
//carry(people: Int) : Prints out “Carrying $peoplepassengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity

class Car(var make: String, var model: String, var color: String, var capacity: Int) {
    fun carry(people: Int) {
        var w = people - capacity
        println("carrying $people passengers")
        if (people <= capacity) {
            println("carrying $people passengers")
        } else {
            println("over capacity $w people")
        }
    }

    fun identity() {
        println("I am a $color $model $make")
    }
}
//Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method calledmaxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip.(2 points)
//The bus’calculateParkingFees method returns the productof hours and
//the capacity of the bus(3 points)
open class bus(model:String,make:String,color:String,capacity: Int){
    fun maxTripCar(fare: Double):Double{
        var totalAmount=fare
        return totalAmount
    }
     fun calculateParkFees(hours:Int):Int{
        var product=hours
        return product
    }
}

