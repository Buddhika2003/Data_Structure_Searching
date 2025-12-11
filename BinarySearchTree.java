class Node{
    int data;
    Node left,right;

    Node(int value){
        data = value;
        left = right = null;
    }
}

public class BinarySearchTree{
    Node root;

    BinarySearchTree(){
        root =  null;
    }
        public void insert(int value){
            root = insertRec(root,value);
        }

        public Node insertRec(Node root,int value){
            if(root == null){
                root = new Node(value);
                return root;
            }

            if(value < root.data){
                root.left = insertRec(root.left,value);
            } else if(value > root.data){
                root.right = insertRec(root.right,value);
            }return root;
        }

        public boolean search(int value){
            return searchRec(root,value);
        }
        public boolean searchRec(Node root,int value){
            if(root == null){
                return false;
            }

            if(root.data == value){
                return true;
            }

            if(value < root.data){
                return searchRec(root.left,value);
            }else{
                return searchRec(root.right,value);
            }

        }

        public void inOrder(Node root){
            if(root != null){
                inOrder(root.left);
                System.out.print(root.data + " ");
                inOrder(root.right);
            }
        }

        public void preOrder(Node root){
            if(root != null){
                System.out.print(root.data + " ");
                preOrder(root.left);
                preOrder(root.right);
            }
        }

        public void postOrder(Node root){
            if(root != null){
                postOrder(root.left);
                postOrder(root.right);
                System.out.print(root.data + " ");
            }
        }
        public static void main(String[] args){
            BinarySearchTree tree = new BinarySearchTree();
           int[] values = {12 , 3, 23 , 45 , 18 , 7 , 9};
           for(int v : values){
            tree.insert(v);
           }

            System.out.println("Inorder traversal:");
            tree.inOrder(tree.root);
            System.out.println();

            System.out.println("Preorder traversal:");
            tree.preOrder(tree.root);
            System.out.println();

            System.out.println("Postorder traversal:");
            tree.postOrder(tree.root);
            System.out.println();

           
        }
}