public class xthNode {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public static Node xNode(Node root, int x){
            if(root == null){
                return null;
            }

            root.left = xNode(root.left, x);
            root.right = xNode(root.right, x);

            if(root.data == x && root.left == null && root.right == null){
                return null;
            }

            return root;
        }

        public static void inOrder(Node root){
            if(root == null){
                return;
            }

            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root.xNode(root, 7);
        System.out.println();
        root.inOrder(root);

    }
}
