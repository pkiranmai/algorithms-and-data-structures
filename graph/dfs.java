/*Complete the function below*/
class GfG
{   
    public void DFS(int v,LinkedList<Integer> adj[],boolean visited[])
    {
      // add code here.
      //base case
    
      System.out.print(v+" ");
      
      if(!visited[v]) visited[v] = true;
      LinkedList <Integer> tmp = adj[v];
      while(tmp.peek()!=null){
          int nbr = tmp.poll();
          if(visited[nbr]) continue;
          
          //if not visited
          DFS(nbr, adj, visited);
      }
      
      return;
    }
}