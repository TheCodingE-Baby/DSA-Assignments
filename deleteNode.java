package com.codesforDSA.www;

public class deleteNode {
	
	Node head;
	
	class Node {
		int value;
		Node next; 
		
		Node(int a){
			value = a;
			next = null;
		}
	}
	
	 void deleteAtPosition(int position) {
	    	if (head == null)
	    		return;

	    	Node temp = head;

	    	if (position == 0) {
	    		head = temp.next;
	    		return;
	    	}
	    	// Find the key to be deleted
	    	for (int i = 0; temp != null && i < position - 1; i++)
	    		temp = temp.next;

	    	// If the key is not present
	    	if (temp == null || temp.next == null)
	    		return;

	    	// Remove the node
	    	Node next = temp.next.next;

	    	temp.next = next;
	    }
	 
	 /** For the delete to occur, we need to add some nodes,
	  * So we can take the InsertAtEnd constructor from the
	  * previous program
	  */
	  // Insert at the end
	    public void InsertAtEnd (int new_data) {
	        Node new_node = new Node(new_data);
	        
	        if(head == null) {
	            head = new Node(new_data);
	            return;
	        }
	        
	        new_node.next = null;
	        
	        Node last = head;
	        while(last.next != null) 
	            last = last.next;
	            
	        last.next = new_node;
	        return;
	    }

	// Print the list 
	 public void printList() {
	    	Node tnode = head;
	    	while(tnode != null) {
	    		System.out.println(tnode.value + " ");
	    		tnode = tnode.next;
	    	}
	    }
	 public static void main(String[] args) {
		deleteNode d = new deleteNode();
		
		d.InsertAtEnd(5);
		d.InsertAtEnd(4);
		d.InsertAtEnd(3);
		d.InsertAtEnd(2);
		d.InsertAtEnd(1);
		
		d.deleteAtPosition(2);
		
		System.out.println("List with a  Deleted node: ");
		d.printList();
	 }
}
