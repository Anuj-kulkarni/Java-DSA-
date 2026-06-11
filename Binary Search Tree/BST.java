import java.util.*;

public class BST {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public static Node insert(Node root, int val){
            if(root == null){
                root = new Node(val);
                return root;
            }

            if(root.data > val){
                root.left = insert(root.left, val);
                return root;
            }

            if(root.data < val){
                root.right = insert(root.right, val);
                return root;
            }

            return root;
        }

        public static boolean search(Node root, int val){
            if(root == null){
                return false;
            }

            if(root.data == val){
                return true;
            }

            if(root.data < val){
                return search(root.right, val);
            }
            
            if(root.data > val){
                return search(root.left, val);
            }

            return false;
        }

        public static Node findInOrderSuccesor(Node root){
            while(root.left != null){
                root = root.left;
            }

            return root;
        }
        
        public static Node delete(Node root, int val){
            if(root.data < val){
                root.right = delete(root.right, val);
            }else if(root.data > val){
                root.left = delete(root.left, val);
            }else{
                if(root.left == null && root.right == null){
                    return null;
                }

                if(root.left == null){
                    return root.right;
                }else if(root.right == null){
                    return root.left;
                }else{
                    Node IS = findInOrderSuccesor(root.right);
                    root.data = IS.data;
                    root.right = delete(root.right, val);
                }
            }
            return root;
        }

        public static void inRange(Node root, int k1, int k2){
            if(root == null){
                return ;
            }


            if(root.data >= k1 && root.data <= k2){
                inRange(root.left, k1, k2);
                System.out.print(root.data + " ");
                inRange(root.right, k1, k2);
            }else if(root.data > k2){
                inRange(root.right, k1, k2);
            }else{
                inRange(root.left, k1, k2);
            }

        }

        public static void inOrder(Node root){
            if(root == null){
                return;
            }

            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        public static void printPath(ArrayList<Integer> path){
            for(int i=0; i<path.size(); i++){
                System.out.print(path.get(i) + " ");
            }
            System.out.println();
        }

        public static void printRoot2Leaf(Node root, ArrayList<Integer> path){
            if(root == null){
                return;
            }

            path.add(root.data);
            if(root.left == null && root.right == null){
                printPath(path);
            }

            printRoot2Leaf(root.left, path);
            printRoot2Leaf(root.right, path);

            path.remove(path.size() - 1);
        }

        public static boolean isVaildBST(Node root, Node min, Node max){
            if(root == null){
                return true;
            }

            if(min != null && root.data <= min.data){ // left subtree min must be null
                return false;
            }

            if(max != null && root.data >= max.data){ // right subtree max must be null
                return false;
            }

            return isVaildBST(root.left, min, root) && isVaildBST(root.right, root, max);
        }

        public static void mirrorBST(Node root){
            if(root == null){
                return;
            }

            mirrorBST(root.left);
            mirrorBST(root.right);

            Node temp = root.left;
            root.left = root.right;
            root.right = temp;
        }

        public static void preOrder(Node root){
            if(root == null){
                return;
            }

            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);
        root.left.right = new Node(6);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

        // root.inRange(root, 5, 12);
        // root.inOrder(root);
        // ArrayList<Integer> path = new ArrayList<>();
        // root.printRoot2Leaf(root, path);

        root.inOrder(root);
        System.out.println();
        root.mirrorBST(root);
        root.inOrder(root);
    }
}
