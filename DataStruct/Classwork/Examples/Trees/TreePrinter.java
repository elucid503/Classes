package Classwork.Examples.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreePrinter {

    public static void printBreadthFirst(Node node) {

        // breadth-first traversal using a queue 

        Queue<Node> queue = new LinkedList<>();

        queue.add(node);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            System.out.print(currentNode.getValue() + " ");

            for (Node child : currentNode.getChildNodes()) {
                queue.add(child);
            }
        }

    }

    public static void printDepthFirst(Node node) {

        // depth-first traversal using recursion

        System.out.print(node.getValue() + " ");

        for (Node child : node.getChildNodes()) {

            printDepthFirst(child);

        }

    }

}