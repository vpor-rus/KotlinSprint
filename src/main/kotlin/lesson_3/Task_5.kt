package org.example.lesson_3

/*Продолжаем работать над приложением “Шахматы”. Напиши программу для сервера,
 которая примет строку, отправленную игроком (считаем эти данные уже известными
 и объявляем строку с данными: “D3-D4;0”.

Необходимо будет сделать обратное. Распарсить строку – разбить ее на 5 составляющих:
 откуда, куда и номер хода, присвоить соответствующим переменным и распечатать по отдельности*/

fun main() {

    val chessStep = "D3-D4;0"
    val parsing = chessStep.split("-" , ";")

    val startStep = parsing[1]
    val finishStep = parsing[2]
    val numberStep = parsing[3]

    println("При ходе № ${numberStep}")
    println("Фигура стояла на: $startStep")
    println("Cделала ход на клетку: $finishStep")
}

