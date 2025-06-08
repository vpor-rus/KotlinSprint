package org.example.lesson_16

/*
Создай класс, описывающий пользователя, который хранит поля логин и пароль.

Пароль не должен быть виден в теле главной функции, но должен быть способ проверить,
что пароль введен верно. Функция валидации должна принимать строку и возвращать результат
проверки (и только его – без распечатки или генерации других строк).

Выведи информацию о корректности введенного пароля.*/

fun main() {
    val newUser = User("DrPupkin", "zxcvb")
    newUser.validation()
}

class User(val newLogin: String, val newPassword: String,) {

    private val correctLogin = "DrPupkin"
    private val correctPassword = "qwerty"

    fun validation() {
        if (newLogin == correctLogin) {
            if (newPassword == correctPassword) {
                println("Пароль $newPassword верен")
            } else {println("Пароль $newPassword не верен")}
        } else {println("Логин $newLogin не верен.")}
    }
}