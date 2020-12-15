package lesson7;

import java.util.LinkedList;

public abstract class Paths {

    protected boolean[] marked;
    protected int[] edgeTo;
    private int source;

    public Paths(Graph g, int source) {
        this.source = source;
        edgeTo = new int[g.getVertexCount()];
        marked = new boolean[g.getVertexCount()];
    }

    public boolean hasPathTo(int dist){
        return marked[dist];
    }

    public LinkedList<Integer> pathTo(int dist){
        if(!hasPathTo(dist)){
            return null;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        int vertex = dist;
        while(vertex != source){
            stack.push(vertex);
            vertex = edgeTo[vertex];
        }
        System.out.println("path = " + stack.size());
        return stack;
    }
}
