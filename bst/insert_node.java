/* Structure of BST node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null; }
}*/
class GfG
{
   /* This function should insert a new node with given data and
      return root of the modified tree  */
    Node insert(Node root, int data)
    {
         // Your code here
         if(root == null){
             root = new Node(data);
             return root;
         }
         
         //no duplicates
         if(data < root.data){
             root.left = insert(root.left, data);
         } else { if(root.data < data){
             root.right = insert(root.right, data);
             }
        }
         
         return root;
    }
}