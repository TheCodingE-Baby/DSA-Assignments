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
	    public void insertAtPos(int value, int pos) {
	    	
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

				if (current != null) {
					n.next = current.next;
					current.next = n;
				} else {
					System.out.println("Position out of bounds.");
				}
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
	    	i.insertAtPos(3, 0);
	    	i.insertAtPos(0, 1);
	    	i.insertAtPos(10, 2);
	    	i.insertAtPos(71, 3);
	    	i.insertAtPos(11, 4);
	    	
	    	i.printList();
	    	
	    }
}

