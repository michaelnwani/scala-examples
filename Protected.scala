package automobiles
/**
    Only files defining just classes and objects which are
    compiled with scalac may be defined as belonging to a package.
*/

class Vehicle {
    protected def checkEngine() {}
}

class Car extends Vehicle {
    def start() {
        checkEngine() // OK
    }
    def tow(car: Car) {
        car.checkEngine() // OK
    }
    def tow(vehicle: Vehicle) {
        vehicle.checkEngine() // ERROR
    }
}

class GasStation {
    def fillGas(vehicle: Vehicle) {
        vehicle.checkEngine() // ERROR
    }
}
