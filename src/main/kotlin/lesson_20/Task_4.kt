package org.example.lesson_20

/*
В разрабатываемом приложении мы реализуем список элементов. Изначально он представлен списком строк.
При помощи map преобразуй его в список лямбд, каждая из которых печатает в консоль:
“Нажат элемент [название_элемента]”.

“Нажми” каждый четный элемент списка.*/

fun main() {
    val  listManyString = listOf<String>(
        "нулевая строка", "первая строка", "вторая строка", "третья строка", "четвертая строка", "пятая строка"
    )
    val enumerationList: List<() -> Unit> = listManyString.map{element -> {println("нажат элемент [$element]")}}

    for (index in enumerationList.indices step 2) {
        enumerationList[index]()
    }
}