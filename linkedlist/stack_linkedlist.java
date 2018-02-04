/*
The structure of the node of the stack is
class StackNode
{
	int data;
	StackNode next;
}
class Stack_using_LinkedList
{
	 StackNode top;
}
*/

// This is method only submission

class GfG
{
	/* The method push to push element into the stack */
        void push(int a,Stack_using_LinkedList ob)
	{
		// Your code here
		StackNode tmp = new StackNode();
		tmp.data = a;
		tmp.next = null;
		//base case
		
		if(ob.top==null){
		    //ob = new Stack_using_LinkedList();
		    ob.top = tmp;
		    return;
		}
		
		tmp.next = ob.top;
		ob.top = tmp;
	    return;
	}
        /*The method pop which return the element poped out of the stack*/
	int pop(Stack_using_LinkedList ob)
	{
		//Your code here
		//base case
		if(ob.top == null || ob == null) return -1;
		
		int ans = ob.top.data;
		ob.top = ob.top.next;
		return ans;
	}
	
}
