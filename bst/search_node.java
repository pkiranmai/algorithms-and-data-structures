/* Node class
class Node
{
	int data;
	Node left, right;
	Node(int d)
	{
		data = d;
		left = right = null;
	}
}*/

/*You are required to complete this method*/
class GfG
{
    boolean search(Node root, int x)
    {
	// Your code here
	
	//base case
	if(root == null)
	    return false;
	    
	if(root.data == x)
	    return true;
	    
	if(x < root.data){
	    return search(root.left, x);
	} else{ 
		return search(root.right, x); }
    }
    
}