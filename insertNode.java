package com.codesforDSA.www;


public class insertNode {
	    Node head;
	    
	    //Create a node
	     class Node {
	        int value;
	        Node next;
	        
	        Node(int a) {
	            value = a;
	            next = null;
	        }
	    }
	   
	    
	    // Insert at any position
	    public void InsertAtPos(int value, int pos) {
	    	Node n = new Node(value);
	    	
	        if (pos == 0) {
	            n.next = head;
	            head = n;
	            return;
	        }
	            Node current = head;
	            int currentPos = 0;
	            
	            while(current != null && currentPos < pos - 1) {
	            	current = current.next;
	            	currentPos += 1;
	            	
	            if(current == null) {
	            	System.out.println("Position out of bounds.");	            		
	            	}
	            }

		        n.next = current.next;
		        current.next = n;
	        }
	    
	    // Print afterwards
	    public void printList() {
	    	Node tnode = head;
	    	while(tnode != null) {
	    		System.out.println(tnode.value + " ");
	    		tnode = tnode.next;
	    	}
	    }
	    public static void main(String[] args) {
	    	insertNode i = new insertNode();
	    	
	    	System.out.println("Singly Linked List: ");
	    	i.InsertAtPos(3, 0);
	    	i.InsertAtPos(0, 1);
	    	i.InsertAtPos(10, 2);
	    	i.InsertAtPos(71, 3);
	    	i.InsertAtPos(11, 4);
	    	
	    	i.printList();
	    	
	    }
}

