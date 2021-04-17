package com.Test;

public class SmallestElementInTree {

	public static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public Node root;

	public SmallestElementInTree() {
		root = null;
	}

	public int smallestElement(Node temp) {
		if (root == null) {
			System.out.println("Tree is empty");
			return 0;
		} else {
			int leftMin, rightMin;
			int min = temp.data;
			if (temp.left != null) {
				leftMin = smallestElement(temp.left);

				min = Math.min(min, leftMin);
			}

			if (temp.right != null) {
				rightMin = smallestElement(temp.right);
				min = Math.min(min, rightMin);
			}
			return min;
		}
	}

	public static void main(String[] args) {  
	  
		SmallestElementInTree treeObj = new SmallestElementInTree();  
	         
	        treeObj.root = new Node(10);  
	        treeObj.root.left = new Node(20);  
	        treeObj.root.right = new Node(30);  
	        treeObj.root.left.left = new Node(40);  
	        treeObj.root.right.left = new Node(50);  
	        treeObj.root.right.right = new Node(60);  
	  
	          
	        System.out.println(" Smallest element:" + treeObj.smallestElement(treeObj.root));  
	      
}
	
}
