package com.codesforDSA.www;

public class DelAfterANode {
	
	Node head;
	
	//Create a node 
	class Node {
		int val;
		Node next;

		Node(int b) {
			val = b;
			next = null;
		}
	}
	
	public void deleteAfterNode(Node prev) {
		if(head == null) {
			System.out.println("Nothing to delete here, since the list is empty");	
		}
		
		Node curr = head;
		
		while(curr != null && curr == prev) {
			curr = curr.next;
		}
		
		if(curr == null || curr.next == null) {
			System.out.println("Either this node is the last node or doesn't exist.");
			return;
		}
		
		Node nodeToDel = curr.next;
		curr.next = nodeToDel.next;
		nodeToDel = null;
	}
	
	
	
	/*To use the deleteAfterNode method*
	 *we need some values and we can use
	 *the Insert methods to do so*/
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
    	Node t = head;
    	while(t != null) {
    		System.out.println(t.val + " ");
    		t = t.next;
    	}
    }
    
    // Finally, we use the main method and check
    public static void main(String[] args) {
    	DelAfterANode dA = new DelAfterANode();
    	
    	System.out.println("Previous Singly LinkedList: ");
    	dA.InsertAtPos(10, 0);
    	dA.InsertAtPos(15, 1);
    	dA.InsertAtPos(20, 2);
    	dA.InsertAtPos(25, 3);
    	dA.InsertAtPos(30, 4);
    	
    	dA.printList();
    	
    	System.out.println("Singly LinkedList with a node removed: ");
    	dA.deleteAfterNode(dA.head.next);
    	dA.printList();
    }
}