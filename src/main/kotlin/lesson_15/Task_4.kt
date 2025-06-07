package org.example.lesson_15

/*
На сайте музыкального магазина есть товары двух категорий: инструменты и комплектующие к ним.
Все товары имеют название и количество единиц на складе.

Для инструментов есть возможность поиска соответствующих комплектующих.

Опиши классы для категорий товаров. Создай общий класс  для хранения общих свойств всех товаров.
Имитируй процесс поиска текстовым сообщением «Выполняется поиск». Для выноса логики поиска используй интерфейс.*/

fun main() {

    val guitar = MusicalInstrument("Гитара", 2)
    val component = Components("Струна", 6)

    guitar.productSearch()
    guitar.componentSearch("струна")
    component.productSearch()

}
interface ProductSearch{
    fun productSearch()
}

abstract class MusicProducts(val name: String, val number: Int,): ProductSearch

class MusicalInstrument(name: String, number: Int,): MusicProducts(name, number) {
    override fun productSearch() {
        println("Выполняется поиск")
    }

    fun componentSearch(components: String) {
        println("поиск $components для $name")
    }
}

class Components(name: String, number: Int,): MusicProducts(name, number) {
    override fun productSearch() {
        println("Выполняется поиск")
    }
}


