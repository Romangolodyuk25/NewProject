fun main(args: Array<String>) {
    val list = List()

    list.addHead(10)
    list.addTail(15)
    list.addTail(3)
    list.addTail(25)


    var result = list.addHead(4)

    try {
       list.get(5)
    } catch (e: NullPointerException) {
        println("Вы ввели недопустимый индекс")
    }

//    println(result1)
}