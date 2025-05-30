package org.example.lesson_13

/*
Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

Программа должна заполнять контакты в телефонную книгу (отдельный список объектов).

- если пользователь не ввел номер телефона, то нужно уведомить об этом пользователя и такая запись не должна добавляться;
- для приведения введенного номера к числу используй toLongOrNull();
- если пользователь не заполнил компанию, то в объект записывать null.

Выведи созданные объекты в консоль методом класса.*/

fun main() {
val listAbonent = PhoneDirectorya()
    listAbonent.newPhoneDirectoryia(
        nameDate = "корова",
        phoneNumberDate = "23456789",
        companiNameDate = null,
    )

    listAbonent.newPhoneDirectoryia(
        nameDate = "смурфик",
        phoneNumberDate = "98765432",
        companiNameDate = "колхоз"
    )

        listAbonent.printThread()
}

class PhoneDirectorya(
    var listAbonent: MutableList<PhoneDirectoryia> = mutableListOf()
) {
    fun newPhoneDirectoryia(
        nameDate: String,
        phoneNumberDate: String,
        companiNameDate: String?,
    ): PhoneDirectoryia {
        val createNewPhoneDirectoryia = PhoneDirectoryia(
            name = nameDate,
            phoneNumber = phoneNumberDate,
            companiName = companiNameDate?: "null",
        )
        listAbonent.add(createNewPhoneDirectoryia)
        return createNewPhoneDirectoryia
    }

    fun printThread() {
        listAbonent.forEach {
            println("имя: ${it.name}, номер телефона: ${it.phoneNumber.toLongOrNull()}, название компании: ${it.companiName} ")
        }
    }
}

class PhoneDirectoryia(
    val name: String,
    val phoneNumber: String,
    val companiName: String?,
)