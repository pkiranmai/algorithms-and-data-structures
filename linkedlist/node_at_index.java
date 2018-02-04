/*  Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}


  Linked List class
class LinkedList
{
    Node head;  // head of list
}

This is method only submission.
You only need to complete the method.
*/

class GfG{
// Should return data of node at given index. The function may
//  assume that there are at least index+1 nodes in linked list
    public int GetNth(LinkedList l, int index){
        // Your code here
        int i = 0;
        while(i<index){
            i++;
            l.head = l.head.next;
        }
        return l.head.data;
    }  
}