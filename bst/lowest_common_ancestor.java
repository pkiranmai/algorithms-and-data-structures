/* A Binary Search Tree node */
/* class Node
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
    Node lca(Node node, int n1, int n2) 
    {
        // Your code here
        //base case
        if(node == null)
        return null;
        
        //if both < node, recurse on left
        if(n1 < node.data && n2 < node.data)
            return lca(node.left, n1, n2);
        //if both > node, recurse on right
        else if(n1 > node.data && n2 > node.data)
            return lca(node.right, n1, n2);
        //if 1 is > and 1 is < node, node is lca
        return node;
        
    }
    
}