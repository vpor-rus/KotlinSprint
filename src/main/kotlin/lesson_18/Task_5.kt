package org.example.lesson_18

/*
В приложении есть экран, на котором можно рисовать различные фигуры, указывая координаты (x, y).
Фигурами могут быть круг, квадрат и точка. Координаты могут быть представлены типами данных Int и Float.

Создайте класс Screen, который будет содержать методы draw для рисования каждой фигуры с
координатами типов Int и Float. Каждый метод должен возвращать строку, указывающую, какая фигура нарисована
 и в каких координатах. Используйте перегрузку методов для реализации.*/

/*fun main() {

}
class DrawingView(context: Context, attrs: AttributeSet?) : View(context, attrs) {

    private val paint = Paint().apply {
        color = Color.BLUE
        style = Paint.Style.STROKE
        strokeWidth = 5f
    }

    private val rectangles = mutableListOf<RectF>()
    private var currentRect: RectF? = null

    private var startX = 0f
    private var startY = 0f

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // Рисуем уже сохранённые прямоугольники
        for (rect in rectangles) {
            canvas.drawRect(rect, paint)
        }

        // Рисуем текущий прямоугольник (если есть)
        currentRect?.let { canvas.drawRect(it, paint) }
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                startX = event.x
                startY = event.y
                currentRect = RectF(startX, startY, startX, startY)
                invalidate()
                return true
            }
            MotionEvent.ACTION_MOVE -> {
                currentRect?.apply {
                    right = event.x
                    bottom = event.y
                }
                invalidate()
                return true
            }
            MotionEvent.ACTION_UP -> {
                currentRect?.let { rectangles.add(it) }
                currentRect = null
                invalidate()
                return true
            }
        }
        return super.onTouchEvent(event)
    }
} */
