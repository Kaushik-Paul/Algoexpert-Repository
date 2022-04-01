package io.algoexpert.easy;

public class FindClosestValueInBST {

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

    public FindClosestValueInBST() {
        this.root = null;
    }

    public FindClosestValueInBST(int value) {
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

    public int getClosestValue(int target) {
        return getClosestValueHelper(this.root, target, Integer.MAX_VALUE);
    }

    private int getClosestValueHelper(Node node, int target, int closest) {
        if (node == null) {
            return closest;
        }
        if (node.value == target) {
            return node.value;
        }

        if (Math.abs(node.value - target) < Math.abs(closest - target)) {
            closest = node.value;
        }

        if (target < node.value) {
            return getClosestValueHelper(node.left, target, closest);
        }
        return getClosestValueHelper(node.right, target, closest);
    }

    public static void main(String[] args) {
        FindClosestValueInBST bst = new FindClosestValueInBST();
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
        int key = 12;
        System.out.println("The closest value is: " + bst.getClosestValue(key));
    }

}
