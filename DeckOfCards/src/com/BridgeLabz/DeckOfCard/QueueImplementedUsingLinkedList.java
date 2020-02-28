package com.BridgeLabz.DeckOfCard;

import java.util.List;
import java.util.Scanner;
public class QueueImplementedUsingLinkedList<T>{

	LinkedList<T> queue = new LinkedList<T>();
	int index = 0;
	int bankBalance = 500000;
	Scanner scanner = new Scanner(System.in);
	int counter = 1;

	/**
	 * Purpose: method for getting the size of queue
	 * 
	 *  returns the size
	 */
	public int size() {
		return index;
	}

	/**
	 * Purpose: method for enqueue the element
	 * 
	 *  data getting the data from user
	 */
	public void enQueue(T data) {
		queue.add(data);
		index++;
	}

	public void enQueueAll(List<T> list) {
		for (int i = 0; i < list.size(); i++) {
			enQueue(list.get(i));
		}
	}

	/**
	 * Purpose: method for dequeue the element
	 */
	public void deQueue() {
		index--;
		queue.deleteAtIndex(index);
	}

	/**
	 * Purpose: method for printing queue
	 */
	public void show() {
		queue.show();
	}

	/**
	 * Purpose: method for printing queue without spaces
	 */
	public String showQueueWithoutSpace() {
		return queue.showListWithoutSpaces();
	}

	/**
	 * Purpose: checking weather queue is empty or not
	 * 
	 * @return returns the true if empty else false
	 */
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	/**
	 * Purpose: getting the value of last index
	 * 
	 * @return returns the value
	 */
	public T get() {
		return queue.get(index);
	}

	/**
	 * Purpose: getting the value of particular index
	 */
	public T get(int ind) {
		return queue.get(ind);
	}


}
