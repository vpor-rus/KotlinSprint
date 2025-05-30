package org.example.lesson_13

import kotlin.text.toLongOrNull

/*Скопируй класс из предыдущей задачи (без логики заполнения телефонной книги) и измени его название
для избегания конфликтов.

Для получения номера программа считывает ввод пользователя с типом String по умолчанию. Приведи строку к типу Long.
Если пользователь ввел что-либо, кроме цифр — программа падает.

Необходимо избежать падения программы при попытке приведения строки к типу Long. Отлови ошибку
и выведи ее название в консоль.*/

fun main() {
    val listAbonent = PhoneDirectoryaa()
    listAbonent.newPhoneDirectoryia(
        nameDate = "ниф-ниф",
        phoneNumberDate = "9876543",
        companiNameDate = "соломенный дом"
    )
    listAbonent.printThread()
}

class PhoneDirectoryaa(
    var listAbonent: MutableList<PhoneDirectoryiaa> = mutableListOf()
) {
    fun newPhoneDirectoryia(
        nameDate: String,
        phoneNumberDate: String,
        companiNameDate: String?,
    ): PhoneDirectoryiaa {
        val createNewPhoneDirectoryia = PhoneDirectoryiaa(
            name = nameDate,
            phoneNumber = phoneNumberDate.toLongOrNull(),
            companiName = companiNameDate?: "<название не указано>",
        )
        listAbonent.add(createNewPhoneDirectoryia)
        return createNewPhoneDirectoryia
    }

    fun printThread() {
        listAbonent.forEach {
            println("имя: ${it.name}, номер телефона: ${it.phoneNumber}, название компании: ${it.companiName} ")
        }
    }
}

class PhoneDirectoryiaa(
    val name: String,
    val phoneNumber: Long?,
    val companiName: String?,)