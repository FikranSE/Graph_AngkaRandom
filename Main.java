import java.util.ArrayList;
class Graph{
    ArrayList<ArrayList<Integer>>graph;
    int V;

    Graph(int nodes){
        V = nodes;
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<Integer>());
        }
    }

    void addEdge(int v,int u){
        graph.get(v).add(u);
        graph.get(u).add(v);
    }

    void printGraph(){
        for(int i=0;i<V;i++){
            System.out.print("Node : "+i);
            for(int x : graph.get(i))System.out.print(" -> "+x);
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String args[]){
        //Output Graph Harga Pesanan
        Graph g = new Graph(7);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 5);
        g.addEdge(5, 3);
        g.addEdge(6, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 1);
        g.printGraph();
    }
}
