import org.w3c.dom.Node

class List(head: ListNode? = null, tail: ListNode? = null) {
    private var tail: ListNode? = null
    private var head: ListNode? = null
    private var size: Int = 0
     fun addtail(value: Int) { // функция которая добавит Node в конце
         var newNode: ListNode = ListNode(value)
         //this.size++
        if (this.tail == null) {
            this.tail = newNode
            this.head = newNode

            return
           // this.addtail(ListNode(5))//cоздать новый node
        }
         this.tail!!.next = newNode
         this.tail = newNode
    }
    fun addhead(value: Int):ListNode { // Функция которая добавит Node вначале
        var newNode:ListNode=ListNode(value)
        if(this.head==null) {
            this.head = newNode
            this.tail = newNode

            return newNode
        }
        newNode.next = this.head
        this.head = newNode
        return newNode
    }
}
