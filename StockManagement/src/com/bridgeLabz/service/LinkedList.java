package com.bridgeLabz.service;

public class LinkedList<T> {
	private Node head = null;
	private int size;

	private class Node {
		private Node next;
		private T value;

		public Node(T v, Node n) {
			value = v;
			next = n;
		}

		public Node(T v) {
			value = v;
			next = null;
		}
	}

	// logic for adding value at head
	public void addHead(T value) {
		head = new Node(value, head);
		size++;
	}

	// logic for displaying
	public void display() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.value + " ");
			curr = curr.next;
		}
	}

	// logic for adding at tail
	public void append(T value) {
		if (head == null) {
			Node n = new Node(value);
			head = n;
		} else {
			Node n = new Node(value);
			Node curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = n;
		}
		size++;
	}

	// logic for removing value
	public void remove(T value) {
		if (head == null) {
			System.out.println("Linked List Empty exception");
			return;
		}
		// if head value is same
		if ((head.value).equals(value)) {
			head = head.next;
			size--;
		}

		// generic method
		Node curr = head;
		while (curr.next != null) {
			if ((curr.next.value).equals(value)) {
				curr.next = curr.next.next;
				size--;
			} else
				curr = curr.next;
		}

	}

	// logic to return true or false for searching
	public boolean search(T value) {
		if (head == null) {
			return false;
		} else {
			Node curr = head;
			while (curr != null) {
				if ((curr.value).equals(value)) {
					return true;
				} else
					curr = curr.next;
			}
		}
		return false;
	}

	// empty linked list logic
	public boolean isEmpty() {
		return (size == 0);
	}

	// logic for size of linked list
	public int size() {
		return size;
	}

	// logic for finding index of Searched item
	public int index(T value) {
		int i = 0;
		int j = 0;
		Node curr = head;
		while (curr != null) {
			if ((curr.value).equals(value)) {
				j = i;
			} else
				curr = curr.next;
			i++;
		}
		return j;
	}

	// logic for inserting value to linked list
	public void insert(T value, int i) {
		Node n = new Node(value);
		Node curr = head;
		Node prev = null;
		int j = 0;
		if (i == j) {
			head = new Node(value, head);
			size++;
		} else {
			while (curr.next != null) {
				if (i == j) {
					prev.next = n;
					n.next = curr;
					size++;
					return;
				}
				prev = curr;
				curr = curr.next;
				j++;
			}
		}
	}

	// logic for returning value
	public T pop() {

		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		T value = curr.value;
		size--;
		return value;
	}

	public T pop(T value) {
		T x = null;
		int i = 0;
		int j = 0;
		if (i == j) {
			T v = head.value;
			head = head.next;
			size--;
			return v;
		} else {
			Node curr = head;
			Node prev = null;

			while (curr.next != null) {
				if (i == j) {
					x = curr.value;
					prev.next = curr.next;
					size--;
					break;
				}
				prev = curr;
				curr = curr.next;
			}
		}
		return x;

	}

	public String returnString() {
		String st = "";
		if (head == null)
			return null;
		else {
			Node curr = head;
			while (curr != null) {
				st = st + curr.value + " ";
				curr = curr.next;
			}
		}
		return st;
	}

	public T removeHead() {
		if (head == null) {
			System.out.println("LinkedList is Empty ");
			return null;
		}

		T v = head.value;
		head = head.next;
		size--;
		return v;

	}
	

}
