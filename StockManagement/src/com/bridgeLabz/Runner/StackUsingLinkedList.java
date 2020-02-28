package com.bridgeLabz.Runner;

public class StackUsingLinkedList<T> {
	private Node head = null;
	private int size = 0;

	private class Node {
		private Node next;
		private T value;

		public Node(T v, Node n) {
			next = n;
			value = v;
		}

		public Node(T v) {
			value = v;
			next = null;
		}
	}

	// logic for pushing or adding value
	public void push(T value) {
		if (head == null) {
			head = new Node(value, null);
			size++;
			return;
		}
		Node curr = head;
		Node n = new Node(value, null);
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = n;
		size++;
	}

	// logic for popping or returning last value
	public T pop() {
		if (head == null) {
			System.out.println("Empty Linked List");
			return null;
		}
		Node curr = head;
		Node prev = null;
		while (curr.next != null) {
			prev = curr;
			curr = curr.next;
		}
		T value = curr.value;
		prev.next = null;
		size--;
		return value;
	}

	// if stack empty
	public boolean isEmpty() {
		return (head == null);
	}

	// print reverse
	public void printReverse() {
		// first reversing the linked list
		Node prev = null;
		Node next = null;
		Node curr = head;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		// printing the linked list
		Node a = head;
		while (a != null) {
			System.out.print(a.value + " ");
			a = a.next;
		}
	}

	// display all element of LinkedList in Stack Array
	public void display() {
		Node n = head;
		while (n != null) {
			System.out.print(n.value + " ");
			n = n.next;
		}
	}

	// print the particular index value
	public T valueOf(int index) {
		Node n = head;
		int find = 0;
		if (head == null) {
			System.out.println("Stack is Empty");
		} else {
			while (find != index) {
				find++;
				n = n.next;
			}
		}
		T v = n.value;
		return v;
	}

	// insert value on particular index
	public void insertOnIndex(int index, T item) {
		Node n = head;
		int find = 0;
		while (find != index) {
			find++;
			n = n.next;
		}
		n.value = item;
	}

	// POP value from head
	public T returnHead() {
		if (head == null) {
			System.out.println("Empty Linked List");
			return null;
		}
		T v = head.value;
		head = head.next;
		size--;
		return v;
	}
}
