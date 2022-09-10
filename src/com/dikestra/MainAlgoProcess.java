package com.dikestra;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MainAlgoProcess {

    List<Node> nodeList = new ArrayList<>();

    public MainAlgoProcess(List<Node> nodeList) {
        this.nodeList = nodeList;
    }

    public void runDijekstra(int node) {

        PriorityQueue<Node> queue = new PriorityQueue();
        nodeList.get(node-1).setDistance(0);
        nodeList.get(node-1).setParent(null);
        nodeList.get(node-1).setVisited(true);
        queue.addAll(nodeList);

        while (!queue.isEmpty()) {

            Node temp = queue.remove();

            for (Node intm : temp.getNeighbour()) {

                if(intm.isVisited())
                    continue;
                if (temp.getDistance() + temp.getWeightedMap().get(intm) < intm.getDistance()) {
                    intm.setDistance(temp.getDistance() + temp.getWeightedMap().get(intm));
                    intm.setParent(temp);
                    intm.setVisited(true);
                    queue.remove(intm);
                    queue.add(intm);
                }
            }

        }
        printPath(nodeList.get(nodeList.size()-1));
    }

    public void printPath(Node node){

        if(node.getParent() == null){
            System.out.print(node.getName()+ " ");
            return;
        }else{
            System.out.print(node.getName()+ " ");
        }
        printPath(node.getParent());
    }

        public void addNeighbour ( int start, int end, int weight){
            Node first = nodeList.get(start - 1);
            Node second = nodeList.get(end - 1);
            first.setNeighbour(second);
            first.getWeightedMap().put(second, weight);
        }


    }

