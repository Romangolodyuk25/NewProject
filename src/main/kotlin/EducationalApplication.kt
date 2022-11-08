fun main(args: Array<String>) {
    val list = List()

    list.addHead(10)
    list.addTail(15)
    list.addTail(3)
    list.addTail(25)


    var result = list.addHead(4)

    try {
       var tryRes = list.get(5)
        println(tryRes)
    } catch (e: IndexOutOfBoundsException) {
        println("Вы ввели недопустимый индекс")
    }

//    println(result1)
}