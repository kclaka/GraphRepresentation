package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Graph{

    public static void main(String[] args) {
        Graph g = new Graph(10);
        g.addEdge(0, 4, 100);
        g.addEdge(6, 3, 20);
        System.out.println(g);
        System.out.println(g.isConnected(6, 3));
    }

    class Edge{
        int v, w;
        public Edge(int v, int w){
            this.v = v;
            this.w = w;
        }

        @Override
        public String toString(){
            return String.format("( %d, %d)", v, w);
        }
    }

    List<Edge>[] G;

    public Graph(int n){
        G = new LinkedList[n];
        for(int i = 0; i <G.length; i++){
            G[i] = new LinkedList<Edge>();
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < G.length; i++){
            sb.append(String.format("%d ==> %s\n", i, G[i]));
        }

        return sb.toString();
    }

    void addEdge(int u, int v, int w){
        G[u].add(0, new Edge(v, w));
    }

    public boolean isConnected(int u, int v){
        for(Edge i: G[u]){
            if(i.v == v){
                return true;
            }
        }

        return false;
    }
}

public class GraphExample {
    public static void main(String[] args) {
        List<Integer>[] l = new LinkedList[10];
        for(int i = 0; i < 10; i++){
            l[i] = new LinkedList<>();
       }

        l[0].add(10);l[0].add(11);l[0].add(12);
        l[1].add(20); l[1].add(21); l[1].add(22);
        l[2].add(30); l[2].add(31); l[2].add(32);

        System.out.println(Arrays.toString(l));
    }
}
