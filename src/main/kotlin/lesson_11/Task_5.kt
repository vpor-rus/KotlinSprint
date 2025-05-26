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

    forum.createNewUser()
    forum.createNewMessage()
    forum.createNewUser()
    forum.createNewMessage()
    forum.printThread()

}

class MessageForum() {
    var autorId = 0
    var message = ""

    fun setAutorId(_autorId: Int): MessageForum {
        this.autorId = _autorId
        return this
    }

    fun setMessage(_message: String): MessageForum {
        this.message = _message
        return this
    }
}

class MemberForum() {
    var userId = 0
    var userName = ""

    fun setUserId(_userId: Int): MemberForum {
        this.userId = _userId
        return this
    }

    fun setUserName(_userName: String): MemberForum {
        this.userName = _userName
        return this
    }
}

class Forum {
    fun createNewUser () {}

    fun createNewMessage() {}

    fun printThread() {}
}

