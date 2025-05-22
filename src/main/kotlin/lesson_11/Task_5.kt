package org.example.lesson_11

/*Реализовать класс работы форума (Forum). Для реализации создай дополнительные классы для сущностей
“Член форума” (с полями userId и userName) и “Сообщение форума” (с полями authorId и message).

Примени паттерн “Строитель” для создания пользователей и сообщений форума. Напрямую объекты не создаются,
 логика должна быть инкапсулирована внутри методов класса.

- createNewUser() создает новых пользователей, принимая имя пользователя. Метод сохраняет нового пользователя
 в общий список и одновременно возвращает новый объект. Генерация id-шников новых пользователей происходит внутри;
- createNewMessage() создает сообщения, принимая id пользователя. Сообщения создаются только если такой
пользователь есть на форуме;
- printThread() печатает в консоль все сообщения добавленные на форум в формате:

    автор: сообщение
    автор: сообщение

Создай экземпляр Forum и продемонстрируй его работу, добавив двух пользователей и по два сообщения от
каждого пользователя.*/

fun main() {

    val fisherman1 = UserForum(
        userId = 1,
        userName = "fisherman1",
        onlain = true,
    )

    val fisherman2 = UserForum(
        userId = 2,
        userName = "fisherman2",
        onlain = true,
    )

    val fisherman3 = UserForum(
        userId = 3,
        userName = "fisherman3",
        onlain = false
    )

    val sakhRiver = Forum(
)

}

class MessageForum(
    val message: String,
)

class UserForum(
   val userId: Int,
   val userName: String,
   val onlain: Boolean = false,
)

class Forum(
    val membersForum: MutableList<UserForum>
) {
    fun createNewUser(): MutableList<String> {
    print("Введите имя нового пользователя: ")
    membersForum.add(element = UserForum)
    print("В форум добавлен новый участник.")
        return membersForum
    }
}