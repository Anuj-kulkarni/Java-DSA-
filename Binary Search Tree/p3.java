import java.util.*;

public class p3 {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Build balanced BST from sorted list
    public static Node BST(ArrayList<Integer> path, int s, int e) {
        if (s > e) return null;

        int mid = s + (e - s) / 2;
        Node r = new Node(path.get(mid));

        r.left = BST(path, s, mid - 1);   
        r.right = BST(path, mid + 1, e);  
        return r;
    }

    // Collect inorder traversal into path
    public static void inOrderInsert(Node root, ArrayList<Integer> path) {
        if (root == null) return;
        inOrderInsert(root.left, path);
        path.add(root.data);
        inOrderInsert(root.right, path);
    }

    // Print inorder traversal
    public static void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        // Unbalanced BST
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        // Step 1: Collect inorder traversal
        ArrayList<Integer> path = new ArrayList<>();
        inOrderInsert(root, path);

        // Step 2: Build balanced BST
        Node balancedRoot = BST(path, 0, path.size() - 1);

        // Step 3: Print inorder of balanced BST
        System.out.println("Inorder of balanced BST:");
        inOrder(balancedRoot);  // Output: 3 5 6 8 10 11 12
    }
}
