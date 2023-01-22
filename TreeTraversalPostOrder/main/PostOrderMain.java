package com.TreeTraversalPostOrder.main;

import com.TreeTraversalPostOrder.entity.BinaryTree;
import com.TreeTraversalPostOrder.entity.Node;

public class PostOrderMain {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(15);
        tree.root.left = new Node(28);
        tree.root.right = new Node(37);
        tree.root.left.left = new Node(48);
        tree.root.left.right = new Node(52);
 
        System.out.println("Postorder traversal of binary tree is :");
        tree.postOrder(tree.root);

	}

}
