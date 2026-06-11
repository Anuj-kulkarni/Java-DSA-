public class univalued{

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public static boolean unival(Node root){
            if(root == null){
                return true;
            }

            if(root.data != root.left.data && root.left != null){
                return false;
            }

            if(root.data != root.right.data && root.right != null){
                return false;
            }

            return unival(root.left) && unival(root.right);
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

        
        if ( root.unival(root) == false){
            System.out.println("NO");
        } else{
            System.out.println("Yes");
        }
    }
}