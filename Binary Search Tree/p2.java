public class p2 {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

            public static Node arrToBST(int arr [], int s, int e){
            
            if(s > e){
                return null;
            }

            int mid = s + (e - s)/2;

            Node root = new Node(arr[mid]);

            root.left = arrToBST(arr, s, mid-1);
            root.right = arrToBST(arr, mid+1, e);            

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
    public static void main(String[] args) {
        int arr [] = {3, 5, 6, 8, 10, 11, 12};

        Node root = arrToBST(arr, 0, arr.length-1);
        inOrder(root);
    }
}
