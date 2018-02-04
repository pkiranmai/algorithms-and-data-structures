/*
A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class GfG
{
    /*You are required to complete this method */
    boolean isHeap(Node tree)
    {
       // Your code here
       //base case
       if(tree==null){
           return true;
       }
       if(tree.left!=null && tree.left.data > tree.data) return false;
       if(tree.right!=null && tree.right.data > tree.data) return false; //heap, not bst
       else return isHeap(tree.left)&&isHeap(tree.right); 
    }
}