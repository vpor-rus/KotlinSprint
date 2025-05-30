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
        compainNameData = null
    )
    listAbonent.newPhoneDirectory(
        nameData = "Ситх",
        phoneNumberData = 12345654321,
        compainNameData = "Sitkh and Co"
    )
    listAbonent.newPhoneDirectory(
        nameData = "капитан Немо",
        phoneNumberData = 89000000000,
        compainNameData = null
    )
    listAbonent.newPhoneDirectory(
        nameData = "Клоун",
        phoneNumberData = 98765432109,
        compainNameData = "Цирк"
    )
    listAbonent.newPhoneDirectory(
        nameData = "Великий уравнитель",
        phoneNumberData = 3030,
        compainNameData = "null"
    )

    val editListAbonentNameCompani = listAbonent.listAbonents.mapNotNull { phoneDirectoriy -> phoneDirectoriy.companiName}
    print(editListAbonentNameCompani)

}

class ListAbonent(
    var listAbonents: MutableList<PhoneDirectoriy> = mutableListOf()
) {
    fun newPhoneDirectory(
        nameData: String,
        phoneNumberData: Long,
        compainNameData: String?,
    ): PhoneDirectoriy{
        val createNewPhoneDirectoriy = PhoneDirectoriy(
            name = nameData,
            phoneNumber = phoneNumberData,
            companiName = compainNameData,
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