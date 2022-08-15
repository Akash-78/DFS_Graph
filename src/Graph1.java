import java.util.Iterator;
import java.util.LinkedList;

public class Graph1 {
    private int V;
    private LinkedList<Integer> adj[];

    public Graph1(int v) {
        V = v;
        adj =new LinkedList[v];
        for(int i=0;i<v;i++)
            adj[i]= new LinkedList<>();

    }
    public void addEdge(int v,int u){
        adj[v].add(u);
    }
    public void DFS(int s){
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[s]=true;
        queue.add(s);
        while (queue.size()!=0){
            s=queue.poll();
            System.out.println(s+" ");
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()){
                int n= i.next();
                if(!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }

    }

    public static void main(String[] args) {
        Graph1 g = new Graph1(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);
        System.out.println("Starting index from 2nd position");
        g.DFS(2);

    }
}
