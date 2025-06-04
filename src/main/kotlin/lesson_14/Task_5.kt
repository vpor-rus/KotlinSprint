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
    fun getNextId(): Int{
        return messageList.size + 1
    }

    override fun addMessage(message: String, autorMessage: String): Message {
        val newMessage = Message(message, autorMessage, getNextId())
        messageList.add(newMessage)
        return newMessage
    }

    override fun addThreadMessage(message: String, autorMessage: String, parentId: Int): ChildMessage? {
        val parentMessage = messageList.find { it.id == parentId }
        return //дописать когда прочитаю про find
    }
}



abstract class Chat(
  val messageList: MutableList<Message> = mutableListOf()
) {
    abstract fun addMessage(message: String, autorMessage: String): Message
    abstract fun addThreadMessage(message: String, autorMessage: String, parentId: Int): ChildMessage?
    abstract fun printChat(){}
}

 open class Message(val text: String, autor: String, val id: Int) {
    var parentMassegeId: Int? = null
}

class ChildMessage(text: String, autor: String, id: Int, parentId: Int){
    init {
        var parentNessageId = parentId
    }
}