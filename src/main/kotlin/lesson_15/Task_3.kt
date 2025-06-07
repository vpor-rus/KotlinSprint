package org.example.lesson_15

/*
На форуме есть два типа пользователей – обычные пользователи и администраторы.

Пользователи могут читать форум и писать сообщения. Администраторы дополнительно
могут удалять сообщения и пользователей.

Опиши классы для сущностей пользователей и администраторов, используя абстрактный класс.
У абстрактного класса должны быть соответствующие общие поля и методы. Действия на форуме
отобрази сообщениями в консоль.*/

fun main() {
    val user1 = User("Юзер")
    val adminstrator1 = Administrator("Администратор")

    user1.readForum()
    adminstrator1.deleteMessage()
}

abstract class ForumUser(val name: String) {
    abstract fun readForum()
    abstract fun writeMessage(message: String)
}

class User(name: String): ForumUser(name){
    override fun readForum() {
        println("$name читает")
    }

    override fun writeMessage(message: String) {
        println("$name пишет сообщение")
    }
}

class Administrator(name: String): ForumUser(name) {
    override fun readForum() {
        println("$name читает")
    }

    override fun writeMessage(message: String) {
        println("$name пишет сообщение")
    }

    fun deleteMessage() {
        println("$name удаляет сообщение")
    }

    fun deleteUser() {
        println("$name заблокировал и удалил пользователя")
    }
}
