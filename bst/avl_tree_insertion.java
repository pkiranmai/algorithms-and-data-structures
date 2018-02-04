/*The Node class is as follows
class Node{
	
	int height;
        int data;
        Node left,right;

	Node(int data)
        {
		this.data = data;
		this.height = 0;
		this.left = null;
		this.right = null;
	}
}*/

class GfG{
    public static int getHeightDiff(Node node){
        return node.left.height - node.right.height;
    }
    
    public static Node leftRotate(Node node){
        Node tmp = node.right.left;
        Node newnode = node.right;
        newnode.left = node;
        node.right = tmp;
        
        //after balancing, update heights
        newnode.height = 1+Math.max(newnode.left.height, newnode.right.height);
        node.height = 1+Math.max(node.left.height, node.right.height);
        
        return newnode;
    }
    
    public static Node rightRotate(Node node){
        Node tmp = node.left.right;
        Node newnode = node.left;
        newnode.right = node;
        node.left = tmp;
        
        //after balancing, update heights
        newnode.height = 1+Math.max(newnode.left.height, newnode.right.height);
        node.height = 1+Math.max(node.left.height, node.right.height);
        
        return newnode;
    }
    
    public Node insertToAVL(Node node,int data)
    {
         //add code here.
         //base case
         if (node==null){
             node = new Node(data);
             return node;
         }
         
         //normal bst insert
         if(data < node.data){
             node.left = insertToAVL(node.left, data);
         } else if(node.data < data) {
                    node.right = insertToAVL(node.right, data);
        } else //duplicates not allowed to insert
            return node;
         
         //update height -- **why didn't i get this part
         node.height = 1+Math.max(node.left.height,node.right.height);
         
         //get height difference
         int bal = getHeightDiff(node);
         
         //if balanced, return node
         if(bal<=1 && bal>=-1) return node;
         
         //if not balanced, then balance
         
         //LL 
         if(bal > 1 && data < node.left.data){
             return rightRotate(node);
         }
         
         //RR
         if(bal <-1 && data > node.right.data){
             return leftRotate(node);
         }
         
         //LR
         if(bal > 1 && data > node.left.data){
             node.left = leftRotate(node.left);
             return rightRotate(node);
         }
         
         //RL
         if(bal < -1 && data < node.right.data){
             node.right = rightRotate(node.right);
             return leftRotate(node);
         }
         
         return node;
    }
}