public class preo {

    static class Node {
        int d;
        Node left, right;

        Node(int data) {
            d = data;
            left = right = null;
        }
    }

    static int idx = -1;

    // Build tree from preorder array with -1 as null
    public static Node buildTree(int[] arr) {
        idx++;
        if (idx >= arr.length || arr[idx] == -1) {
            return null;
        }
        Node root = new Node(arr[idx]);
        root.left = buildTree(arr);
        root.right = buildTree(arr);
        return root;
    }

    // Preorder traversal
    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.d + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = buildTree(nodes);

        System.out.println("Preorder traversal:");
        preorder(root);
    }
}
