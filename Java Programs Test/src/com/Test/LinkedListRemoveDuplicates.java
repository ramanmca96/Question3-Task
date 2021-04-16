package com.Test;

public class LinkedListRemoveDuplicates {

	static class Node {
		int data;
		Node next;

		Node(int temporary) {
			data = temporary;
		}
	}

	static void printLinkedList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}

	static void deleteDuplicates(Node head) {

		// copy head node to temp current node
		Node current = head;

		// Traverse the linked list
		while (current != null) {
			// copy current node to temp node.
			Node temp = current;
			while (temp != null && temp.data == current.data) {
				temp = temp.next;
			}
			current.next = temp;
			current = current.next;
		}
	}

	public static void main(String[] a) {

		Node n1 = new Node(23);
		Node n2 = new Node(29);
		Node n3 = new Node(29);
		Node n4 = new Node(45);
		Node n5 = new Node(45);
		Node n6 = new Node(45);
		Node n7 = new Node(54);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;

		System.out.print("Initial linked list data: ");
		printLinkedList(n1);
		deleteDuplicates(n1);
		System.out.println();
		System.out.print("Linked list data after removing duplicates: ");
		printLinkedList(n1);
	}
}