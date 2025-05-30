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
    forum.createNewMemberForum(
        userNameDate = "телепузик",
        userIdDate = 1,
    )
    forum.createNewMemberForum(
        userNameDate = "радиопузик",
        userIdDate = 2,
    )
    forum.createNewMessageForum(
        messageDate = "привет",
        autorIdDate = 1
    )
    forum.createNewMessageForum(
        messageDate = "пока",
        autorIdDate = 2
    )


}

class Forum(
    var memberForum: MutableList<MemberForum> = mutableListOf(),
    var messageList: MutableList<MessageForum> = mutableListOf(),
    var counterId: Int = 1,
) {

    fun createNewMemberForum(
        userNameDate: String,
        userIdDate: Int,
    ): MemberForum{
        val newMemberForum = MemberForum(
            userId = counterId,
            userName = userIdDate,
        )
        memberForum.add(newMemberForum)
        counterId++
        return newMemberForum
    }

    fun createNewMessageForum(
        messageDate: String,
        autorIdDate: Int,
    ): MessageForum{
        val newMessageForum = MessageForum(
            message = messageDate,
            autorId = counterId
        )
        messageList.add(newMessageForum)
        return newMessageForum
    }

    fun printThread(){
        messageList.forEach { print("автор : ${it.autorId} \n сообщение : ${it.message}") }
    }

}

class MemberForum(
    val userId: Int,
    val userName: Int,
)


class MessageForum(
    val message: String,
    val autorId: Int,
){

}



