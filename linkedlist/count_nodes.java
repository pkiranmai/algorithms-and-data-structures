/*
  Node of a linked list
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
    public int getCount(LinkedList list){
        //Add code here
        int ans = 0;
        while(list.head!=null){
            ans++;
            list.head = list.head.next;
        }
        return ans;
    }  
}