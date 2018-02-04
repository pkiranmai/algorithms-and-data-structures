/* Structure of LinkedList
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/
class GfG
{
    boolean isCircular(Node head)
    {
	// Your code here	
	//base case
	if(head==null) return true;
	Node tmp = head;
	while(head!=null){
	    head = head.next;
	    if(head == tmp) return true;
	}
    
        return false;
    }
}