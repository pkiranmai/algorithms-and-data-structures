/* class Node
{
    int key;
    Node left, right;

    Node(int item)
    {
        key = item;
        left = right = null;
    }
}*/
class GfG
{   
    static Node getPred(Node root){
        while(root.right!=null){
            root = root.right;
        }
        
        return root;
    }

    Node deleteNode(Node root, int key) 
    {
	// Your code here
	//base case
	if(root == null) return null;
	
	//if it's the node you're looking for
	if(key < root.key){ root.left = deleteNode(root.left, key); return root; }
	else if(root.key < key){ root.right = deleteNode(root.right, key); return root; }

	//if node has 2 children - swap with successor/predecessor and remove it
	if(root.right!=null && root.left!=null){
	    Node tmp = getPred(root.left);
	    
	    root.key=tmp.key;
	    
	    //i'll swap key with pred/succ and propagate the delete
	    root.left = deleteNode(root.left, root.key);
	    return root;
	}
	//if node has only 1 child
	if(root.left==null && root.right!=null)
	    root = root.right;
	else if(root.left!=null && root.right==null)
	    root = root.left;
	else	//if node is leaf
	    if(root.left==null && root.right==null) //need as elseif - or else, root will be modified above and this check will occur
	        root = null;
	
	return root;
	
    }
}