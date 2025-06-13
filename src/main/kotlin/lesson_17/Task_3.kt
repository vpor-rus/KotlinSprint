package org.example.lesson_17

/*
В приложении для хранения облачных файлов есть папки и файлы.

Создай класс папки, который имеет имя, количество файлов и флаг “секретно”.
Если флаг имеет значение true, то при попытке прочитать имя, возвращать строку
“скрытая папка” и количество файлов – 0. В ином случае возвращать ее название и
реальное количество файлов. Для реализации должны использоваться геттеры.

Создай экземпляр “скрытой” папки. Протестируй попытку чтения ее данных.

fun main() {
val packageWork = Package("Рабочая", 23, true)
    packageWork.folderName = "Фотки с отпуска"
}

private class Package(private val _name: String, private val _numberFails: Int, private val _flagSecret: Boolean) {
    var folderName: String
        get() = if (_flagSecret) println("скрытая папка")
        else _name

    var : Int
        get() = if (_flagSecret) println("скрытая папка")
        else _numberFails
}*/



