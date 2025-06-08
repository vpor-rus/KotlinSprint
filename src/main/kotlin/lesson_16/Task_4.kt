package org.example.lesson_16

/*
Создай класс, описывающий заказ в интернет-магазине. В заказе должны быть номер заказа и статус готовности.
Номер заказа должен быть недоступен для изменения.

Создай метод, который меняет статус заказа. Поменять статус заказа можно только отправив заявку менеджеру.
Имитируй это действие отдельной публичной функцией. Она будет принимать новый статус и обращаться к
внутреннему методу класса для изменения статуса.*/

fun main() {
    val myOrder = OnlineOrder(1234)
    myOrder.requestManager()
}

class OnlineOrder(
    private val numberOrder: Int,
    var orderIsReady: Boolean = false,
    ) {
    fun requestManager() {
        orderIsReady = true
        println("Заказ $numberOrder готов")
    }
}