class ListNode(var value: Int) {
    var next: ListNode? = null
}

class List {
    fun newfieldstart(head: ListNode, next: ListNode) {

    }

    fun newfieldfinal(head: ListNode, next: ListNode) {

    }
}

fun main(args: Array<String>) {
    var head: ListNode = ListNode(10)
    head.next = ListNode(8)
    head.next!!.next= ListNode(7)
    head.next!!.next!!.next = ListNode(14)

    val List = List()
   // var result = List.newfieldstart(10,8)

}