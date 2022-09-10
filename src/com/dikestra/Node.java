package com.dikestra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Node implements Comparable<Node>{
    String name;
    List<Node> neighbour = new ArrayList<>();
    boolean visited;
    HashMap<Node,Integer> weightedMap = new HashMap<>();
    int distance ;
    Node parent;

    public Node(String name){
        this.name = name;
        this.distance = Integer.MAX_VALUE;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNeighbour(Node neighbour) {
        this.neighbour.add(neighbour);
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setWeightedMap(HashMap<Node, Integer> weightedMap) {
        this.weightedMap = weightedMap;
    }

    public String getName() {
        return name;
    }

    public List<Node> getNeighbour() {
        return neighbour;
    }

    public boolean isVisited() {
        return visited;
    }

    public HashMap<Node, Integer> getWeightedMap() {
        return weightedMap;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.distance,o.distance);
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getParent() {
        return parent;
    }
}
