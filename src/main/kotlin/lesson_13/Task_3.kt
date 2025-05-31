package org.example.lesson_13

/*Скопируй класс из предыдущей задачи и измени его название для избегания конфликтов.

Для того, чтобы взаимодействовать со всеми записями телефонной книги, как с одним целым, их нужно объединить в список.

- создай и инициализируй (одновременно) список с 5 объектами класса-контакта;
- 2 контакта должны принимать null для поля компании;
- 1 контакт должен иметь название компании “null”;
- выведи список всех существующих компаний, которые есть в телефонной книге.*/

fun main() {

     mutableListOf()

    val phoneDirectoriy1 = PhoneDirectoriy("Кот Леопольд", 89046758090, null,)
    val phoneDirectoriy2 = PhoneDirectoriy("Ситх", 12345654321, "Sitkh and Co")
    val phoneDirectoriy3 = PhoneDirectoriy("капитан Немо", 89000000000, null)
    val phoneDirectoriy4 = PhoneDirectoriy("Клоун", 98765432109, "Цирк")
    val phoneDirectoriy5 = PhoneDirectoriy("Великий уравнитель", 3030, "null")

    val listPhoneDirectoriy: MutableList<PhoneDirectoriy> = mutableListOf(phoneDirectoriy1, phoneDirectoriy2,
                                                        phoneDirectoriy3, phoneDirectoriy4, phoneDirectoriy4)
    listPhoneDirectoriy.forEach {  }
}

class PhoneDirectoriy(
    val name: String,
    val phoneNumber: Long,
    val companiName: String?,
)


