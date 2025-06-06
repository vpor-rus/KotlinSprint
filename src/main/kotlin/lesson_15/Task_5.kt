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
    val lada1 = PasangerClass(2)
    lada1.peopleLoading()
}

interface MovementCar {
    fun startMoving() {
        println("Машину завели, включили нужную скорость, отпустили стояночный тормоз")
    }

    fun manevringCar() {
        println("Машина движется к конечной точке, НЕ НАРУШАЯ ПДД!")
    }

    fun stopCar() {
        println("Нажали тормоз до остановки, выключили скорость, заглушили двигатель")
    }

}

interface CargoTransportation {
    fun cargoLoading()
    fun cargoUnloading()
}

interface PeoplesTransportation {
    fun peopleLoading()
    fun peopleUnloading()
}

class PasangerClass(numberPasanger: Int) : PeoplesTransportation, MovementCar {
    override fun peopleLoading(numberPasanger: Int) {
        if (numberPasanger < 3) {
            println("В машине есть еще место")
        } else {
            println("Места в машине больше нет")
        }
    }

    override fun peopleUnloading(numberPasanger: Int) {
        if (numberPasanger > 0) {
            println("в машине остались люди")
        } else {
            println("машина пуста")
        }

    }

    override fun startMoving() {
        println("Машину завели, включили нужную скорость, отпустили стояночный тормоз")
    }

    override fun manevringCar() {
        println("Машина движется к конечной точке, НЕ НАРУШАЯ ПДД!")
    }

    override fun stopCar() {
        println("Нажали тормоз до остановки, выключили скорость, заглушили двигатель")
    }
}

class CargoAutomobile(numberPasanger: Int, cargoWeight: Int) : PeoplesTransportation, CargoTransportation, MovementCar {
    override fun peopleLoading(numberPasanger: Int) {
        if (numberPasanger < 1) {
            println("В машине есть еще место")
        } else {
            println("Места в машине больше нет")
        }
    }

    override fun peopleUnloading(numberPasanger: Int) {
        if (numberPasanger > 0) {
            println("в машине остались люди")
        } else {
            println("машина пуста")
        }

    }

    override fun cargoLoading() {
        TODO("Not yet implemented")
    }

    override fun cargoUnloading() {
        TODO("Not yet implemented")
    }

    override fun startMoving() {
        TODO("Not yet implemented")
    }

    override fun manevringCar() {
        TODO("Not yet implemented")
    }

    fun stopCar() {}


}

