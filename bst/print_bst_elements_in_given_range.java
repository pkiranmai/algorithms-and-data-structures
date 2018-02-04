/* The structure of a BST node is as follows:
class Node
{
    int key;
    Node left, right;

    Node(int item)
    {
        key = item;
        left = right = null;
    }
} */
class GfG
{   
    void Print(Node node, int k1, int k2)
    {
        // Your code here
        //base case
        if(node==null) return;
        
        if(node.key >= k1 && node.key <=k2){
            //print in inorder traversal
            Print(node.left,k1,k2);
            System.out.print(node.key+" ");
            Print(node.right,k1,k2);
        } 
        if(node.key > k2){
            Print(node.left,k1,k2);
        }
        if(node.key < k1){
            Print(node.right,k1,k2);
        }
        
        return;
    }    
}