fun main(args: Array<String>) {
    var tail:ListNode? = null
    var head: ListNode = ListNode(10)
    head.next = ListNode(8)
    head.next!!.next= ListNode(7)
    head.next!!.next!!.next = ListNode(14)

    val List = List(head,tail!!)
    var result = List.addtail(tail)
    var result1 = List.addhead(head)
}