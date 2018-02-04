/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
		left=null;
		right=null;
	}
}*/
class GfG
{
      public static int maxDiff(Node root, int k)
       {
           //add code here.
           //base case
           if(root==null) return 0;
           
            if(root.data == k) return root.data;
           if(k < root.data && root.left==null) return root.data;
           if(k < root.data && root.left!=null){
               int a = Math.abs(k- root.data);
               int tmp = maxDiff(root.left, k);
               int b = Math.abs(k- tmp);
               if (a <= b) return root.data;
               else return tmp;
           }
           if(k > root.data && root.right==null) return root.data;
           if(k > root.data && root.right!=null){
               int a = Math.abs(k- root.data);
               int tmp = maxDiff(root.right, k);
               int b = Math.abs(k- tmp);
               if(a<=b) return root.data;
               else return tmp;
           }
            return 0;
       }
}