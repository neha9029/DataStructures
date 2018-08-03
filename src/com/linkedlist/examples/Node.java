package com.linkedlist.examples;

public class Node {

    Node next;
    int data;
	public Node(int data) {
		this.data = data;
	}
	
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
	
	
	
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

           //Node n = new Node(1);
           LinkedListImplementation list = new LinkedListImplementation(new Node(1));
           list.addToBack(2);
           list.addToBack(3);
           list.addToBack(4);
           list.addToBack(5);
           list.addToBack(6);
           list.addToFront(7);
           list.addToFront(8);
           list.printList();

	}

}
