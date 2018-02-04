/* Node is defined as
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/

class GfG
{
    // Print elements of a linked list on console
    // head pointer input could be NULL as well
    // for empty list
    void printList(Node head)
    {
        //add code here.
        
        while(head!=null){
            System.out.print(head.data+" ");
            head= head.next;
        }
        
        
        return;
    }
}
