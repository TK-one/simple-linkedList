package com.linkedlist;

public class LinkedList {
	private Node head;
	private int size;
	
	public LinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	private class Node {
		private Object data;
		private Node next;
		
		public Node(Object data) {
			this.data = data;
		}

		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	public void add(Object data) {
		Node newNode = new Node(data);
		if (this.head == null) {
			this.head = newNode;
		} else {
			Node currentNode = this.head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			
			currentNode.next = newNode;
		}
		
		this.size++;
	}
	
	public Object get(int index) {
		int i = 0;
		Node currentNode = this.head;
		
		while (i < index) {
			currentNode = currentNode.next;
			i++;
		}
		
		return currentNode.data;
	}
	
	public Object getFirst() {
		if (this.head == null)
			return null;
	
		return this.head.data;
	}
	
	public Object getLast() {
		Node currentNode = this.head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		
		return currentNode.data;
	}
	
	public boolean remove(int index) {
		if (index < 0 || index >= this.size) 
			return false;
		
		if (index == 0) {
			this.head = this.head.next;
		} else {
			Node beforeNode = this.head;
			int i = 0;
			while (i < index - 1) {
				beforeNode = beforeNode.next;
				i++;
			}
			
			if (beforeNode.next.next == null)
				beforeNode.next = null;
			else
				beforeNode.next = beforeNode.next.next;
		}
		
		this.size--;
		return true;
	}
	
	public int size() {
		return this.size;
	}
	
	public String toString() {
		String output = "[";
		Node currentNode = this.head;
		while (currentNode.next != null) {
			output += currentNode.data.toString() + ", ";
			currentNode = currentNode.next;
		}
		output += currentNode.data + "]";
		return output;
	}
	
	
}
