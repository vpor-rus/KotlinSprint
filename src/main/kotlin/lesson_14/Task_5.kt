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

    override fun addTreadMessage(message: String, autorMessage: String, parentMessageId: Int): ChildMessage? {
        val parentMessage = messageList.find { it.id == parentMessageId}
        return  if (parentMessage != null) {
            val newChildMessage = ChildMessage(
                autor = autorMessage,
                text = message,
                id = parentMessageId,
                parentId = getNextId(),
            )
            messageList.add(newChildMessage)
            newChildMessage
        } else {
            println("Сообщения с ID ${parentMessageId} нет")
            null
        }
    }

    override fun printChat() {
        for (message in  messageList) {
            if (message is ChildMessage) {

            }
        }
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
    autor: String,
    text: String,
    val id: Int,
) {
    var parentMessageId: Int? = null
}

class ChildMessage(
    autor: String,
    text: String,
    id: Int,
    parentId: Int,
): Message(autor, text, id,){
    init {
        parentMessageId = parentId
    }
}