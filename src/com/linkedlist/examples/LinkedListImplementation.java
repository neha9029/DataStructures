package com.linkedlist.examples;

public class LinkedListImplementation {

	
	Node head;
	int count;
	
	public LinkedListImplementation(Node head) {
		this.head = head;
		count = 0;
		
	}
	
	public void addToFront(int data) {
		if(head == null) {
			head = new Node(data);
		}
		else {
			Node temp = new Node (data);
			temp.setNext(head);
			head = temp;
			
			
		}
	}
	
	public void addToBack(int data) {
		if(head == null) {
			 head = new Node(data);
		}
		else {
			Node temp = new Node(data);
			Node current = head;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			
			current.setNext(temp);
			count++;
		}
	
	}
	
	
	public void printList() {
		
		Node current = head;
		System.out.println("Head->");
		while(current.getNext() != null){
			System.out.println(current.data);
			current = current.getNext();
		}
		
		System.out.println("null");
		
		
		
	}
}
