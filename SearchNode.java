package com.codesforDSA.www;

public class SearchNode {
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
	     
	  // Insert at the beginning
		    public void InsertAtStart(int new_value) {
		    	
		    	//Insert the data
		        Node new_node = new Node(new_value);
		        new_node.next = head;
		        head = new_node;
		    }
		    
		// Insert at the end    
		    public void InsertAtEnd (int new_value3) {
		        Node new_node_2 = new Node(new_value3);
		        
		        if(head == null) {
		            head = new Node(new_value3);
		            return;
		        }
		        
		        new_node_2.next = null;
		        
		        Node last = head;
		        while(last.next != null) 
		            last = last.next;
		            
		        last.next = new_node_2;
		        return;
		    }
		    
	     // Search a node
         boolean searchNode (Node head, int key) {
             Node current = head;
             while(current != null) {
                 if(current.value == key)
                     return true;
                 current = current.next;
             }
             return false;
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
        	 SearchNode sN = new SearchNode();
        	 sN.InsertAtStart(11);
        	 sN.InsertAtEnd(3);
        	 sN.InsertAtStart(0);
        	 
        	 sN.printList();
        	 
        	 System.out.println();
        	 int searchFor = 3;
        	 
        	 if(sN.searchNode(sN.head, searchFor)) {
        		 System.out.println(searchFor + " is found.");
        	 }
        	 else {
        		 System.out.println(searchFor + " is  not found.");
       }
    }
}
