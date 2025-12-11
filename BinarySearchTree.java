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

        public void insertRec(Node root,int value){
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
        public boolean serachRec(Node root,int value){
            if(root == null){
                return false;
            }

            if(root.data == value){
                return true;
            }

            if(value < root.data){
                return searchRec(root.left,value);
            }else{
                reurn searchRec(root.right,value);
            }

        }

        public void inOrder(Node root){
            if(root != null){
                inOrder(root.left);
                System.out.print(root.data + " ");
                inOrder(root.right);
            }
        }
}