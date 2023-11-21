import java.util.LinkedList;
//----------------------------------------------------- 
// Title: bfs class
// Author: Berke Beyazbenli
// ID: 10022751132
// Section: 1
// Assignment: 1
// Description: bfs algorithm implementation
public class bfs {
//-------------------------------------------------------- 
// Summary: bfs algorithm steps
// 
// Precondition: marked, edgeTo and distTo
// 
// Postcondition:  bfs
//--------------------------------------------------------

    private boolean[] marked;
    private int[] edgeTo;
    private int[] distTo;

    public bfs(Graph G) {
        marked = new boolean[G.V()];
        distTo = new int[G.V()];
        edgeTo = new int[G.V()];
    
    }
    public boolean isMarked(int v) {
        return marked[v];
    }
    

   public int[] bfs(Graph G, int s) {
    Queue<Integer> q = new Queue<Integer>();
      q.add(s);
      marked[s] = true;
      distTo[s] = 0;

      while (!q.isEmpty()) {
         int v = q.remove();
         for (int w : G.adj(v)) {
            if (!marked[w]) {
               q.add(w);
               marked[w] = true;
               edgeTo[w] = v;
               distTo[w] = distTo[v] + 1;
            }
         }
      }
      return distTo;
   }

}
