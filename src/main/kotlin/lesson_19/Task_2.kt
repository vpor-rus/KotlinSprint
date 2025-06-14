package org.example.lesson_19

import org.example.lesson_10.PLAYER_VICTORY_RATE
import org.jsoup.nodes.Range

/*
В интернет-магазине товары делятся на несколько категорий: одежда, канцелярские товары и разное.

– создай enum класс с категориями;
– создай метод внутри enum, который вернет текстовое название категории для пользователя;
– создай класс, описывающий товар (с полями название, id, категория), в классе должен быть метод,
который выводит инфо о товаре. Вызови его для нескольких созданных товаров;
– для вывода информации о товаре, для категории используй метод определения категории.*/

fun main() {
    val product1 = Product("чипсы", 1, ProductCategories.MISCELLANEOUS)
    val product2 = Product("перьевая ручка", 2, ProductCategories.OFFICE_SUPPLIES)
    val product3 = Product("ветровка", 3, ProductCategories.CLOTHING)
    product1.printProperties()
    product2.printProperties()
    product3.printProperties()
}

enum class ProductCategories(val nameCategory: String){
     CLOTHING("одежда"),
     OFFICE_SUPPLIES("канцелярские товары"),
     MISCELLANEOUS("разное"),
 }

private class Product(
    val name: String,
    val id: Int,
    val categories: ProductCategories,
) {
    fun printProperties() {
        println("представляем вам $name находится в товарах категории ${categories.nameCategory} ячейке $id")
    }
}