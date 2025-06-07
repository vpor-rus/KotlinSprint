package org.example.lesson_15

/*
В логике мобильной игры есть грузовые и легковые автомобили с такими параметрами:

- грузовые машины могут перевозить одного пассажира и 2 тонны груза;
- легковые не перевозят груз, но могут вместить до 3 пассажиров.

Создай интерфейсы, обеспечивающие передвижение машин, перевозку пассажиров и перевозку грузов.

- учитывай максимальное и текущее количество перевозимых людей или грузов;
- интерфейсы должны содержать методы загрузки и разгрузки пассажиров или грузов.

Спроектируй классы и несколько объектов. Вызови их методы, «перевезя» таким образом 6 человек и 2 тонны груза.*/

fun main() {
val kamaz1 = CargoAutomobile()
    kamaz1.peopleLoading(1)
    kamaz1.cargoLoading(2.0)
    kamaz1.startMoving()
    kamaz1.manevrCar()
    kamaz1.stopCar()
    kamaz1.peopleUnloading(1)
    kamaz1.cargoLoading(2.0)

    println()

val volga1 = PasangerAutomobile()
    volga1.peopleLoading(3)
    volga1.startMoving()
    volga1.manevrCar()
    volga1.stopCar()
    volga1.peopleUnloading(3)
    volga1.startMoving()
    volga1.manevrCar()
    volga1.stopCar()
    volga1.peopleLoading(2)
    volga1.startMoving()
    volga1.manevrCar()
    volga1.stopCar()
    volga1.peopleUnloading(2)


}

interface MovementCar {
    fun startMoving() {
        println("Машину завели, включили нужную скорость, отпустили стояночный тормоз")
    }

    fun manevrCar() {
        println("Машина движется к конечной точке, НЕ НАРУШАЯ ПДД!")
    }

    fun stopCar() {
        println("Нажали тормоз до остановки, выключили скорость, заглушили двигатель")
    }

}

interface CargoTransportation {
    fun cargoLoading(weight: Double)
    fun cargoUnloading(weight: Double)
}

interface PeoplesTransportation {
    fun peopleLoading(number: Int)
    fun peopleUnloading(number: Int)
}

class PasangerAutomobile : PeoplesTransportation, MovementCar {
    private var passangerInCar = 0
    private val maxPassangerInCar = 3


    override fun peopleLoading(passangerOnAreOff: Int) {
        if (passangerOnAreOff + passangerInCar < maxPassangerInCar) {
            passangerInCar += passangerOnAreOff
            println("В машине $passangerInCar людей")
        } else {
            println("Подсадка невозможна, нет мест")
        }
    }

    override fun peopleUnloading(passangerOnAreOff: Int) {
        if (passangerInCar >= passangerOnAreOff) {
            passangerInCar -= passangerOnAreOff
            println("В машине осталось $passangerInCar пассажиров")
        } else {
            println("Такого количества пассажиров в машине нет.")
        }

    }
    override fun startMoving() {
        super.startMoving()
    }

    override fun manevrCar() {
        super.manevrCar()
    }

    override fun stopCar() {
        super.stopCar()
    }
}

class CargoAutomobile : PeoplesTransportation, CargoTransportation,
    MovementCar {
        private var passangerInCar  = 0
        private val maxPassangerInCar = 1
        private var cargoInCar = 0.0
        private val maxCargoInCar = 2.0
    override fun peopleLoading(numberPasangerOnOrOff: Int) {
        if (passangerInCar + numberPasangerOnOrOff <= 1) {
            passangerInCar += numberPasangerOnOrOff
            println("в машине $passangerInCar человек")
        } else {
            println("Места в машине больше нет")
        }
    }

    override fun peopleUnloading(numberPasangerOnOrOff: Int) {
        if (numberPasangerOnOrOff <= passangerInCar) {
            passangerInCar -= numberPasangerOnOrOff
            println("в машине осталось $passangerInCar человек")

        } else {
            println("машина пуста")
        }

    }

    override fun cargoLoading(cargoOnAreOff: Double) {
        if (cargoOnAreOff + cargoInCar <= maxCargoInCar) {
            cargoInCar += cargoOnAreOff
            println("В машине $cargoInCar тон груза")
        } else {
            println("загружен полностью")
        }
    }

    override fun cargoUnloading(cargoOnAreOff: Double) {
        if (cargoOnAreOff <= maxCargoInCar) {
            cargoInCar -= cargoOnAreOff
            println("В машине $cargoInCar тон груза")
        } else {
            println("столько груза в машине нет.")
        }
    }

    override fun startMoving() {
        super.startMoving()
    }

    override fun manevrCar() {
        super.manevrCar()
    }

    override fun stopCar() {
        super.stopCar()
    }
}