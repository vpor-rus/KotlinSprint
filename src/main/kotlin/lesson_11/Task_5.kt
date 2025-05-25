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
    forum.createNewMessage(1)
    forum.createNewUser()
    forum.createNewMessage(2)
    forum.printThread()

}

class MessageForum {
    var autorId = 0
    var message = ""

    fun setUserId(_autorId: Int): Int {
        this.autorId = _autorId
        return autorId
    }

    fun setUserName(_message: String): String {
        this.message = _message
        return message
    }
}

class MemberForum {
    var userId = 0
    var userName = ""

    fun setUserId(_userId: Int): Int {
        this.userId = _userId
        return userId
    }

    fun setuserName(_userName: String): String {
        this.userName = _userName
        return userName
    }
}

class Forum(){
    val memberForum = MemberForum()
    val messageForum = MessageForum()

    val listMemberForum = mutableListOf("")

    fun createNewUser(){
        print("Введите имя нового пользователя: ")
        memberForum.userName = readln()
        listMemberForum.add(memberForum.userName)
        memberForum.userId = listMemberForum.indexOf(memberForum.userName)
        print("В список добавлен пользователь ${memberForum.userName} ID номер = ${memberForum.userId}\n")
    }

    val listMessageForum = mutableMapOf<Int, String>()

   fun createNewMessage(userId: Int) {
        if (userId != 0) {
            print("Пользователь с ID=${userId} введите сообщение: ")
            messageForum.message = readln()

        }
       listMessageForum.put(userId, messageForum.message)
   }

    fun printThread()
    {
        for (i in 1 .. (listMessageForum.size)){
            println("автор :${listMemberForum.indexOf(listMessageForum[i] + 1)} \n" +
                    "сообщение : ${listMessageForum[i]}")
        }
    }
}

