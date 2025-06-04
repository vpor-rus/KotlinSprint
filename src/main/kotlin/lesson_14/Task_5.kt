package org.example.lesson_14

/*
Создай класс Chat, который реализует обсуждение в мессенджере, аналогичному Discord.
Класс должен иметь следующие методы:

- addMessage() — добавляет обычное сообщение в чат, принимает на вход текст и автора сообщения;
- addThreadMessage() — добавляет сообщение в тред к предыдущему сообщению (для начала обсуждения),
дополнительно принимает на вход parentMessageId для идентификации сообщения, под которым создается ветка обсуждения;

Сообщения чата должны храниться в списке, в классе Chat. Для создания сообщений соответствующих типов
используй классы Message и ChildMessage в соответствующей иерархии. У каждого типа сообщения должен быть id.

- printChat() — печатает все сообщения чата. Если создано дочернее сообщение, необходимо применить для вывода
табуляцию и печатать его под родительским сообщением. Используй groupBy() для группировки сообщений
по parentMessageId, если сообщение является экземпляром ChildMessage, или по id если это обычное сообщение*/


fun main() {

}

class ChatRealisation: Chat() {
    fun getNextId(): Int {
        return messageList.size + 1
    }

    override fun addMessage(message: String, autorMessage: String,): Message {
        val newMessage = Message(autorMessage, message, id = getNextId(),)
        messageList.add(newMessage)
        return newMessage //добавление нового сообщения через building
    }
}

abstract class Chat(
    var messageList: MutableList<Message> = mutableListOf()
) {
    abstract fun addMessage(): Message
    abstract fun addTreadMessage(): ChildMessage?
    abstract fun printChat()
}

open class Message(
    autorMessage: String,
    message: String,
    val id: Int,
) {
    var parentMessagId: Int? = null
}

class ChildMessage(
    autorMessage: String,
    message: String,
    id: Int,
    parentId: Int,
): Message(autorMessage, message, id,){
    init {
        parentMessagId = parentId
    }
}