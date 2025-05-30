package org.example.lesson_13

/*
Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

Программа должна заполнять контакты в телефонную книгу (отдельный список объектов).

- если пользователь не ввел номер телефона, то нужно уведомить об этом пользователя и такая запись не должна добавляться;
- для приведения введенного номера к числу используй toLongOrNull();
- если пользователь не заполнил компанию, то в объект записывать null.

Выведи созданные объекты в консоль методом класса.*/

fun main() {

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
            phoneNumber = phoneNumberDate.toLongOrNull(),
            companiName = companiNameDate?: "null",
        )
        listAbonent.add(createNewPhoneDirectoryia)
        return createNewPhoneDirectoryia
    }
    fun printThread() {
        val editListAbonement =
    }
}

class PhoneDirectoryia(
    val name: String,
    val phoneNumber: Long?,
    val companiName: String?,
)