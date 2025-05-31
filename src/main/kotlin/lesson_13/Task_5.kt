package org.example.lesson_13

/*Скопируй класс из предыдущей задачи (без логики заполнения телефонной книги) и измени его название
для избегания конфликтов.

Для получения номера программа считывает ввод пользователя с типом String по умолчанию. Приведи строку к типу Long.
Если пользователь ввел что-либо, кроме цифр — программа падает.

Необходимо избежать падения программы при попытке приведения строки к типу Long. Отлови ошибку
и выведи ее название в консоль.*/

fun main() {

    val phoneDirectoriy1 = PhoneDirectoriya("Кот Леопольд", "89046758090", null,)
    val phoneDirectoriy2 = PhoneDirectoriya("Ситх", "09№;%:?", "Sitkh and Co")
    val phoneDirectoriy3 = PhoneDirectoriya("Великий уравнитель", "отказываюсь сообщить номер", "null")

    val listPhoneDirectoriya: MutableList<PhoneDirectoriya> = mutableListOf(phoneDirectoriy1, phoneDirectoriy2,
      phoneDirectoriy3)

    val listPhoneNumber = listPhoneDirectoriya.mapNotNull{ phoneDirectoriya -> phoneDirectoriya.phoneNumber.toLongOrNull() }
    println(listPhoneNumber)
}

class PhoneDirectoriya(
    val name: String,
    val phoneNumber: String,
    val companiName: String?,
)