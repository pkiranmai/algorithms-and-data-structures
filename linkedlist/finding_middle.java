/* Node of a linked list
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
This is method only submission.  You only need to complete the method. */


class GFG
{
    // Function to find middle element a linked list
    int getMiddle(Node head)
   {
         // Your code here.
         //base case
         if(head==null) return -1;
         
         int len = 0;
         Node dummy = head;
         
         while(dummy!=null){
             len++;
             dummy = dummy.next;
         }
         
         len = len/2 + 1;
         int i = 1;
         
         dummy = head;
         while(i<len){
             dummy = dummy.next;
             i++;
         }
         
         return dummy.data;
   }
}