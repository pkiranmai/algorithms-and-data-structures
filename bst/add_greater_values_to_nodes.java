// A Binary Search Tree node
/* class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */

class GfG
{   
    static int count = 0;
    static int helper(Node root){
        //base case
	    if(root==null) return 0;
	
    	//reverse inorder
    	helper(root.right);
    	count = count + root.data;
    	root.data = count;
    	helper(root.left);
    	
    	return count;
    }
    
    void modify(Node root)
    {
	// Your code here
	count = 0; //this****
	helper(root);
    }
    
    
}
