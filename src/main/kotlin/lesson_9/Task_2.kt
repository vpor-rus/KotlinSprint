package org.example.lesson_9

/*Создай новый список ингредиентов, состоящий из 3 шт. Нужно расширить функционал программы –
пусть у пользователя будет возможность добавить к базовым ингредиентам из списка еще один свой.

- после создания базового списка, выведи его в консоль:
        "В рецепте есть базовые ингредиенты: [базовый_список_ингредиентов]";
- затем сообщи о возможности добавить свой: "Желаете добавить еще?” и активировать ввод с консоли;
- если пользователь ввел “нет” или что-то иное – заверши программу, если пользователь ввел “да” – запроси:
           "Какой ингредиент вы хотите добавить?";
- для обработки ответа пользователя используй метод сравнения строк с игнорированием регистра: equals;
- добавь считанное значение в базовый список;
- в конце выведи сообщение со списком всех элементов такого типа:
        "Теперь в рецепте есть следующие ингредиенты: [список_ингредиентов]".*/

fun main() {
    val listIngredient = mutableListOf("Хлеб", "Рис", "Мясо")
    println("В рецепте есть базовые ингридиенты: $listIngredient")
    print("Желаете добавить еще? ")
    val answerAddIngredient = readln()
    if (answerAddIngredient.equals(DESIRE_TO_ADD, true)) {
        print("Какой ингридиент вы хотите добавить? ")
        val newIngredient = readln()
        listIngredient.add(newIngredient)
        println("Теперь в рецепте есть следующие ингридиенты: $listIngredient")
    } else {
        return
    }
}

const val DESIRE_TO_ADD = "да"