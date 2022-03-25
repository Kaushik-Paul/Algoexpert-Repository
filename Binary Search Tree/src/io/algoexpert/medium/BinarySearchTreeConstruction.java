package io.algoexpert.medium;

public class BinarySearchTreeConstruction {

    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public BinarySearchTreeConstruction() {
        this.root = null;
    }

    public BinarySearchTreeConstruction(int value) {
        this.root = new Node(value);
    }

    // Insertion in BSTs
    public void insertion(int key) {
        this.root = insertNode(root, key);
    }

    private Node insertNode(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }
        if (node.value > key) {
            node.left = insertNode(node.left, key);
        } else {
            node.right = insertNode(node.right, key);
        }
        return node;
    }

    // Search Value
    public boolean searchValue(int key) {
        Node node = searchNode(this.root, key);
        return node != null;
    }

    private Node searchNode(Node node, int key) {
        if (node == null) {
            return null;
        }
        if (node.value == key) {
            return node;
        }
        if (node.value > key) {
            return searchNode(node.left, key);
        } else {
            return searchNode(node.right, key);
        }
    }

    // Deletion in BSTs
    public void deletion(int key) {
        this.root = deleteNode(this.root, key);
    }

    private Node deleteNode(Node node, int key) {
        if (node == null) {
            return null;
        }
        if (node.value > key) {
            node.left = deleteNode(node.left, key);
        } else if (node.value < key) {
            node.right = deleteNode(node.right, key);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                node.value = findMinValue(node.right);
                node.right = deleteNode(node.right, node.value);
            }
        }
        return node;
    }

    private int findMinValue(Node node) {
        int mivValue = node.value;
        while (node.left != null) {
            mivValue = root.left.value;
            node = node.left;
        }
        return mivValue;
    }

    // InOrder Traversal
    public void inOrderTraversal() {
        inOrderTraversalHelper(this.root);
        System.out.println("NULL");
    }

    private void inOrderTraversalHelper(Node node) {
        if (node == null) {
            return;
        }
        inOrderTraversalHelper(node.left);
        System.out.print(node.value + "-->");
        inOrderTraversalHelper(node.right);
    }

    public static void main(String[] args) {
        BinarySearchTreeConstruction bst = new BinarySearchTreeConstruction();
        bst.insertion(10);
        bst.insertion(5);
        bst.insertion(2);
        bst.insertion(5);
        bst.insertion(15);
        bst.insertion(13);
        bst.insertion(22);
        bst.insertion(14);
        bst.insertion(1);
        bst.inOrderTraversal();
        int key = 14;
        System.out.println("Is value " + key + " present: " + bst.searchValue(key));
        bst.deletion(14);
        bst.inOrderTraversal();
    }
}
