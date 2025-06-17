package org.example.lesson_19

/*
В интернет-магазине товары делятся на несколько категорий: одежда, канцелярские товары и разное.

– создай enum класс с категориями;
– создай метод внутри enum, который вернет текстовое название категории для пользователя;
– создай класс, описывающий товар (с полями название, id, категория), в классе должен быть метод,
который выводит инфо о товаре. Вызови его для нескольких созданных товаров;
– для вывода информации о товаре, для категории используй метод определения категории.*/

fun main() {
    val product1 = Product("чипсы", 1, ProductCategory.MISCELLANEOUS)
    val product2 = Product("перьевая ручка", 2, ProductCategory.OFFICE_SUPPLIES)
    val product3 = Product("ветровка", 3, ProductCategory.CLOTHING)

    product1.printProperties()
    product2.printProperties()
    product3.printProperties()
}

enum class ProductCategory() {
     CLOTHING,
     OFFICE_SUPPLIES,
     MISCELLANEOUS;

    fun nameToDispalay(): String =
        when(this) {
            CLOTHING -> "одежда"
            OFFICE_SUPPLIES -> "канцелярские товары"
            MISCELLANEOUS -> "разное"
        }
    }

private class Product(
    val name: String,
    val id: Int,
    val categories: ProductCategory,
) {
    fun printProperties() {
        println("представляем вам $name находится в товарах категории ${categories.nameToDispalay()} ячейке $id")
    }
}