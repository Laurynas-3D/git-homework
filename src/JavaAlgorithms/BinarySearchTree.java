package JavaAlgorithms;

// Binary Search Tree, is a node-based binary tree data structure.
// This program is mechanical example how BST works.
// Revisited at 2020-01

public class BinarySearchTree {

    public static void main(String[] args){

        BinarySearchTreeImpl tree = new BinarySearchTreeImpl();

    /* node-based binary tree
              50
            /    \
          30      70
         /  \    /  \
       20   40  60   80     */

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);


        tree.inOrder();
        tree.postOrder();
        tree.preOrder();
    }
}

class BinarySearchTreeImpl {

    Node root;

    BinarySearchTreeImpl() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    // A recursive function to insert a new key in BST
    Node insertRec(Node root, int key) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        // Otherwise, recurse down the tree
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    // This method mainly calls InorderRec()
    void inOrder()  {
        System.out.println("\ninOrder call");
        inOrderRec(root);
    }

    void postOrder()  {
        System.out.println("\npostOrder call");
        postOrderRec(root);
        System.out.println("\n");
    }

    void preOrder()  {
        System.out.println("\npreOrder call");
        preOrderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.println(root.key);
            inOrderRec(root.right);
        }
    }

    void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.key);
        }
    }

    void preOrderRec(Node root) {
        if (root != null) {
            System.out.println(root.key);
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }
}

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

