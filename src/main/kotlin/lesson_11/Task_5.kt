package org.example.lesson_11

import kotlin.collections.find

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
    forum.createNewUser("телепузик")
    forum.createNewUser("радиопузик")
    println(forum.userNameList.toString())
    forum.createNewMessage(
        authorId = 1, message = "привет"
    )
    forum.createNewMessage(
        authorId = 2, message = "пока"
    )
    forum.printThread()

}

class Forum(
    var userIdCounter: Int = 0,
    var userNameList: MutableList<MemberForum> = mutableListOf(),
    var autorId: Int = 0,
    var messageList: MutableList<MessageForum> = mutableListOf(),
) {
    fun createNewUser(
        username: String,

        ): MemberForum {
        val createMemberInForum = MemberForum(
            userName = username,
            userId = userIdCounter,
        )
        userNameList.add(createMemberInForum)
        userIdCounter++
        return createMemberInForum
    }

    fun createNewMessage(
        authorId: Int,
        message: String,
    ): MessageForum {

        val autorid = authorId

        val message = MessageForum(
            message = message, authorId =autorid,
        )
        messageList.add(message)
        return message
    }

    fun printThread() {
        for (i in 0 until (messageList.size)) {
            println(
                "автор : \n" +
                "сообщение : ${messageList[i]}"
            )
        }

    }
}

    class MemberForum(
        userId: Int,
        userName: String,
    )

    class MessageForum(
        authorId: Int,
        message: String,
    )



