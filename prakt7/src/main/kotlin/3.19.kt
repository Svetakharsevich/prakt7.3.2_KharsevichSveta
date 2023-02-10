import kotlin.math.max
import kotlin.math.min
fun main() {
    try {
        println("Введите x1")
        var x1= readln().toDouble()
        println("Введите y1")
        var  y1= readln().toDouble()
        println("Введите x2")
        var x2= readln().toDouble()
        println("Введите y2")
        var  y2= readln().toDouble()
        println("Введите x3")
        var x3= readln().toDouble()
        println("Введите y3")
        var  y3= readln().toDouble()
        println("Введите x4")
        var x4= readln().toDouble()
        println("Введите y4")
        var  y4= readln().toDouble()
        var left= max(x1,x3)
        var  top= min(y2,y4)
        var right= min(x2,x4)
        var bottom= max(y1,y3)
        var width=right-left
        var height=top-bottom
        when{
            (width<=0||height<=0)-> println("Прямоугольники не пересекаются")
            else-> println("${height*width}")
        }
    }
    catch (e: Exception) {
        println("Ошибка.Введите число")
    }
}

