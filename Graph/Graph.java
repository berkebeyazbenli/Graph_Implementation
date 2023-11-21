


import java.util.*;
//----------------------------------------------------- 
// Title: graph class
// Author: Berke Beyazbenli
// ID: 10022751132
// Section: 1
// Assignment: 1
// Description: graph implementation
public class Graph  {
    //-------------------------------------------------------- 
// Summary: graph implementation and other methods
// 
// Precondition: V, E and Bag. These are number of vetices, number of edges and bag for adding adj
// 
// Postcondition:  control the distances
//--------------------------------------------------------

    private int V;
    private int E;
    private Bag<Integer>[] adj;
 
    public Graph(int V)
    {
       this.V = V;
       adj = (Bag<Integer>[]) new Bag[V];
       for (int v = 0; v < V; v++)
          adj[v] = new Bag<Integer>();
    }
 
    public void addEdge(int v, int w)
    {
       adj[v].add(w);
       adj[w].add(v);
 
    }
    public Iterable<Integer> adj(int v) {
        return adj[v];
    }
    public void deleteEdge(int v, int w){
        adj[v].remove(w);
        adj[w].remove(v);

    }


    public boolean isNewRailwayValid(int v, int w) {
        for (int neighbor : adj[v]) {
            if (neighbor == w) {
                return false; // Edge already exists
            }
        }
        return true;
    }
   public List<List<Integer>> addNewRailway(Graph g, int st, int end){
    bfs bfs1 = new bfs(g);
    int[] distTo = bfs1.bfs(g, st);
    int dis = distTo[end] - distTo[st];
   
    List<List<Integer>> paths = new ArrayList<List<Integer>>();

    for (int i = 0; i < g.V(); i++) {
        for(int j = i+1; j< g.V(); j++){
            if(isNewRailwayValid(i, j)){
                g.addEdge(i, j);
                bfs1 = new bfs(g);
                distTo = bfs1.bfs(g, st);
                int newDis = distTo[end] - distTo[st];
                if(dis!=newDis && dis>newDis){
                    g.deleteEdge(i, j);
                }else{
                    List<Integer> path = new ArrayList<Integer>();
                    path.add(i);
                    path.add(j);
                    paths.add(path);
                }

            }

        }
    }
    return paths;
   }
    
     
 
     public int V(){
        return V;
    }

    public int E(){
        return E;
}
 
}
