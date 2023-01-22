package com.TreeTraversalPostOrder.entity;

public class BinaryTree {
	public Node root;
	 
    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
 
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }
}
