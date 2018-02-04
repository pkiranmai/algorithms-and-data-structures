// A Binary Search Tree node
/*class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class GfG
{   
    int getCountOfNode(Node root, int low, int high) 
    {
        // Your code here
        // base case
        if(root==null) return 0;
        
        if(root.data >= low &&  root.data <= high){
            //either i am in range and recurse my children
            return 1 + getCountOfNode(root.left, low, high) + 
            getCountOfNode(root.right, low, high);
        }
        else if(root.data > high){
            //or i'm not in range, so try 1 side - recurse 1 side child
            return getCountOfNode(root.left, low, high);
        }
        else 
            return getCountOfNode(root.right, low, high);
        
    }
}