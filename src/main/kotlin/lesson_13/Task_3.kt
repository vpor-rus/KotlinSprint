package org.example.lesson_13

/*Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

Для того, чтобы взаимодействовать со всеми записями телефонной книги, как с одним целым, их нужно объединить в список.

- создай и инициализируй (одновременно) список с 5 объектами класса-контакта;
- 2 контакта должны принимать null для поля компании;
- 1 контакт должен иметь название компании “null”;
- выведи список всех существующих компаний, которые есть в телефонной книге.*/

fun main() {
    val listAbonent = ListAbonent()

    listAbonent.newPhoneDirectory(
        nameData = "Кот Леопольд",
        phoneNumberData = 89046758090,
        compainNameDate = null
    )
    listAbonent.newPhoneDirectory(
        nameData = "Ситх",
        phoneNumberData = 12345654321,
        compainNameDate = "Sitkh and Co"
    )
    listAbonent.newPhoneDirectory(
        nameData = "капитан Немо",
        phoneNumberData = 89000000000,
        compainNameDate = null
    )
    listAbonent.newPhoneDirectory(
        nameData = "Клоун",
        phoneNumberData = 98765432109,
        compainNameDate = "Цирк"
    )
    listAbonent.newPhoneDirectory(
        nameData = "Великий уравнитель",
        phoneNumberData = 3030,
        compainNameDate = "null"
    )

    val editListAbonentNameCompani = listAbonent.listAbonents.map { phoneDirectoriy -> phoneDirectoriy.companiName?: "<не указано>"}
    print(editListAbonentNameCompani)

}

class ListAbonent(
    var listAbonents: MutableList<PhoneDirectoriy> = mutableListOf()
) {
    fun newPhoneDirectory(
        nameData: String,
        phoneNumberData: Long,
        compainNameDate: String?,
    ): PhoneDirectoriy{
        val createNewPhoneDirectoriy = PhoneDirectoriy(
            name = nameData,
            phoneNumber = phoneNumberData,
            companiName = compainNameDate,
        )
        listAbonents.add(createNewPhoneDirectoriy)
        return createNewPhoneDirectoriy
    }
}

class PhoneDirectoriy(
    val name: String,
    val phoneNumber: Long,
    val companiName: String?,
)