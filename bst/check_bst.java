/*  A Binary Search Tree node
class Node
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
    int isBST(Node root)  
    {
        // Your code here
        return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    static int helper(Node root, int min, int max){
        //base case
        if(root==null) return 1;
        
        //check with parent ranges, instead of seeing if violated at its children
        if(root.data<min || root.data>max) return 0;
        
        //here means, not bst property violated when checked with its parents
        //recurse left child and recurse right child
        if(root.left!=null && helper(root.left,min,root.data)==0) return 0;
        if(root.right !=null && helper(root.right,root.data,max)==0) return 0;
        return 1;
    }

}