import java.util.LinkedList
import java.util.Queue

class ListNode(var value: Int) {
    var next: ListNode? = null

}
class List(head: ListNode, tail:ListNode) {
    fun addtail(head: ListNode) { // функция которая добавит Node в конце
    var queue: Queue<ListNode> = LinkedList<ListNode>()
        queue.add(head)
        while (!queue.isEmpty()){
            var element = queue.poll()
            if (element.next!=null) {
                queue.add(element.next)
            } else{
                head.next = ListNode(5)//cоздать новый node
            }
        }
    }

    fun addhead(head: ListNode) { // Функция которая добавит Node вначале
    }
}

fun main(args: Array<String>) {
    var head: ListNode = ListNode(10)
    head.next = ListNode(8)
    head.next!!.next= ListNode(7)
    head.next!!.next!!.next = ListNode(14)

    //val List:List? = null

}