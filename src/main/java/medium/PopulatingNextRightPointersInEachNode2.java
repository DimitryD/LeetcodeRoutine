package medium;

import common.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNode2 {
    // https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
    public Node connect(Node root) {
        if (root == null) return null;
        Queue<Node> nodes = new ArrayDeque<>();
        nodes.add(root);
        while(!nodes.isEmpty()) {
            List<Node> levelNodes = new ArrayList<>(nodes);
            nodes.clear();
            Node prevNode = levelNodes.get(0);
            for (Node node: levelNodes) {
                if (node != prevNode) {
                    prevNode.next = node;
                    prevNode = node;
                }
                if (node.left != null) nodes.add(node.left);
                if (node.right != null) nodes.add(node.right);
            }
        }
        return root;
    }
}