class List(head: ListNode, tail: ListNode) {
    fun addtail(tail: ListNode) { // функция которая добавит Node в конце
        // while (tail.next != null) {
        if (tail.next == null) {
            tail.next = ListNode(5)//cоздать новый node
        }
        // }
    }
    fun addhead(head: ListNode) { // Функция которая добавит Node вначале
        if (head.next == null) {
        } else {
            head.next = ListNode(6)
        }
    }
}
