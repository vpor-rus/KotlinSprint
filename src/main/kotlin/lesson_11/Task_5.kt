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
    val forum = Forum()
    forum.createNewUser("Телепузик")
    forum.createNewUser("радиопузик")


}

class Forum(
    var auturIdCounter: Int = 0,
    var userIdCounter: Int = 0,
    var messageForum: MutableList<MessageForum> = mutableListOf(),
    var usersName: MutableList<MemberForum> = mutableListOf(),
) {
    fun createNewUser(
        userName: String,
        ): MemberForum {
val userName = MemberForum(
    userName = userName,
    userId = userIdCounter
)
     usersName.add(userName)
        userIdCounter++
        return userName
    }

}

class MemberForum(
    userName: String,
    userId: Int,
) {
    var userName = userName
    fun setUserName(userName: String) = apply {
        this.userName = userName
    }

}

class MessageForum(
    autorId: Forum,
    message: String,
) {
    var message = message
    fun setUserName(userName: String) = apply {
        this.message = message
    }
}




