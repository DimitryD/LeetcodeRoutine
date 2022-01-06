package medium;

import common.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;


public class PopulatingNextRightPointersInEachNode {
    // https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
    public Node connect(Node root) {
        if (root == null) return null;
        // nodes to visit on the next level;
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

    public Node connectRecursive(Node root) {
        if (root == null || root.left == null) return root;
        point(root.left, root.right, null);
        return root;
    }


    private void point(Node left, Node right, Node parentRight) {
        left.next = right;
        if (parentRight != null)
            right.next = parentRight.left;
        if (left.left != null) {
            point(left.left, left.right, right);
            point(right.left, right.right, right.next);
        }
    }
}
