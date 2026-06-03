public class intro {

    static class Node{ // created the class Node
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;

        public static Node buildTree(int node[]){
            idx++;
            if(idx >= node.length || node[idx] == -1){
                return null;
            }

            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);

            return newNode;
        }

        public static void preOrder(Node root){
            if(root == null){
                return;
            }

            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
            System.out.println();
        }

        public static void postOrder(Node root){
            if(root == null){
                return;
            }

            System.out.println();
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
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
        int node[] = {1, 2, 3, 4, 5};

        BinaryTree b1 = new BinaryTree();
        Node root = b1.buildTree(node);

    }
}
