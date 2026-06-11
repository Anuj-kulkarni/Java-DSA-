import java.util.*;

public class kthNode {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static void printKthLevel(Node root, int k) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int level = 0;

        while (!q.isEmpty()) {
            int size = q.size(); // number of nodes at current level

            // If current level == k, print all nodes in this level
            if (level == k) {
                for (int i = 0; i < size; i++) {
                    Node node = q.poll();
                    System.out.print(node.data + " ");
                }
                return; // done
            }

            // Otherwise, process next level
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            level++;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        int k = 2; 
        printKthLevel(root, k); 
    }
}