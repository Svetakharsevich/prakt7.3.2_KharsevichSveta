fun main(){
    try {
        println("Введите число k")
        var k= readln().toInt()
        println("Введите число l")
        var l= readln().toInt()
        println("Введите число n")
        var n= readln().toInt()
        println("Введите число m")
        var m= readln().toInt()
        when{
            ((l % k==0)&&(m%k==0)&&(n%k==0))-> println("Числа делятся на число k")
            else -> println("Числа не делятся на число k")
        }
    }
   catch (e: Exception) {
       println("Ошибка.Введите число")
   }
}

