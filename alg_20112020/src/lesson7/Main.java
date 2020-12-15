package lesson7;

public class Main {
    public static void main(String[] args) {
//        Graph graph = new Graph(5);
//        graph.addEdge(1,2);
//        graph.addEdge(0,4);
//        graph.addEdge(1,4);
//        graph.addEdge(1,0);

        Graph graph = new Graph(10);
        graph.addEdge(0, 3);
        graph.addEdge(0, 6);
        graph.addEdge(0, 7);
        graph.addEdge(1, 3);
        graph.addEdge(1, 5);
        graph.addEdge(1, 8);
        graph.addEdge(1, 9);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);
        graph.addEdge(2, 7);
        graph.addEdge(2, 9);
        graph.addEdge(3, 8);
        graph.addEdge(3, 9);
        graph.addEdge(4, 6);
        graph.addEdge(4, 8);
        graph.addEdge(8, 9);

//        System.out.println(graph.getAdjList(1));
//        System.out.println(graph.getAdjList(4));

//        DepthFirstPaths dfp = new DepthFirstPaths(graph, 2);
//        System.out.println(dfp.hasPathTo(0));
//        System.out.println(dfp.pathTo(0));


        BreadthFirstPaths bfp = new BreadthFirstPaths(graph, 5);
        System.out.println(bfp.hasPathTo(0));
        System.out.println(bfp.pathTo(0));

    }
}
