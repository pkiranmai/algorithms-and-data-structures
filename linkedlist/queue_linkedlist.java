/*
The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
}


and the structure of the class is
class Queue_using_LinkedList
{
	 QueueNode front;
	QueueNode rear;
}
*/

class GfG
{
	
        /* The method push to push element into the queue*/
        void push(int a,Queue_using_LinkedList ob)
	{
		//Your code
		QueueNode tmp = new QueueNode();
		tmp.data = a;
		tmp.next = null;
		if(ob.rear==null || ob.front==null){
		    ob.rear = tmp;
		    if(ob.front==null) ob.front = ob.rear;
		    return;
		}
		
		ob.rear.next = tmp;
		ob.rear=tmp;
		return;
	}
        
        /*The method pop which return the element poped out of the queue*/
	int pop(Queue_using_LinkedList ob)
	{
		
		// Your code
		if(ob.front==null) return -1;
		
		int ans = ob.front.data;
		ob.front = ob.front.next;
		
		//case wise
		//when queue becomes empty
		if(ob.front == null){ //ob.front = null; 
		    ob.rear = null;
		}
		
		return ans;
	}
}