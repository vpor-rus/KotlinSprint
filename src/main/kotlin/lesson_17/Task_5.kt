package org.example.lesson_17

/*
Класс описывает пользователя и хранит свойства логин и пароль (без инициализации по умолчанию).

- при попытке изменить пароль, в консоль должно выводиться «Вы не можете изменить пароль».
- при попытке прочитать пароль – вместо символов должны отображаться звездочки (по количеству символов пароля).
- при изменении логина в консоли должно печататься сообщение об успешной смене логина.

Создай пользователя с произвольными данными и протестируй изменение логина и пароля.
Вся реализация должна быть на сеттерах и геттерах.*/

fun main() {
val myUser = User("User1", "qwerty")
    println(myUser.password)
    myUser.password = "zxcvb"
    myUser.login = "newuser"
}

private class User ( _login: String, _password: String) {
 private var actualPassword = _password
     var password: String
     get() = "*".repeat(actualPassword.length)
     set(value) {
         println("Вы не можете изменить пароль")
     }
    var login = _login
            set(value) {
            println("Пароль успешно изменен")
        }
}