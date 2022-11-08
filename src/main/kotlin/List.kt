import org.w3c.dom.Node

class List(head: ListNode? = null, tail: ListNode? = null) {
    private var tail: ListNode? = null
    private var head: ListNode? = null
    private var size: Int = 0
    fun addTail(value: Int) { // функция которая добавит Node в конце
        var newNode: ListNode = ListNode(value)
        //this.size++
        if (this.tail == null) {
            this.tail = newNode
            this.head = newNode

            return
        }
        this.tail!!.next = newNode
        this.tail = newNode
    }

    fun addHead(value: Int): ListNode { // Функция которая добавит Node вначале
        var newNode: ListNode = ListNode(value)
        if (this.head == null) {
            this.head = newNode
            this.tail = newNode

            return newNode
        }
        newNode.next = this.head
        this.head = newNode
        return newNode
    }

    fun print(): Int {
        var currentNode: ListNode? = this.head
        while (currentNode?.next!=null){
            println(currentNode!!.value)
            currentNode = currentNode.next
        }
        return currentNode!!.value
    }

    fun get (index: Int): Int {
        var currentIndex: ListNode? = this.head
        var n  = index
            while (n!=0) {
                if (currentIndex?.next==null) {
                    throw IndexOutOfBoundsException("Вы ввели недопустимы индецкс")
                }
                if (index==0) {
                    return this.head!!.value
                }
                currentIndex = currentIndex?.next//изменил !! на ?
                n--
            }
        return currentIndex!!.value
    }
}
