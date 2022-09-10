package com.dikestra;

import java.util.ArrayList;
import java.util.List;

public class MainDijekstra {



    public static void main(String[] args) {
        List<Node> nodeList = new ArrayList<>();
        for(int i =0;i<5;i++){
            nodeList.add(new Node("A"+i));
        }

        MainAlgoProcess mainAlgoProcess = new MainAlgoProcess(nodeList);
        mainAlgoProcess.addNeighbour(1,3,6); //Add A-> C , weight 6
        mainAlgoProcess.addNeighbour(1,4,3); //Add A-> D , weight 3
        mainAlgoProcess.addNeighbour(2,1,3); //Add B-> A , weight 3
        mainAlgoProcess.addNeighbour(3,4,2); //Add C-> D , weight 2
        mainAlgoProcess.addNeighbour(4,3,1); //Add D-> C , weight 1
        mainAlgoProcess.addNeighbour(4,2,1); //Add D-> B , weight 1
        mainAlgoProcess.addNeighbour(5,2,4); //Add E-> B , weight 4
        mainAlgoProcess.addNeighbour(5,4,2); //Add E-> D , weight 2

        mainAlgoProcess.runDijekstra(1);

    }
}
