
public class StacksUsingLinkedLists {
	private Node head;
	
	public StacksUsingLinkedLists() {
		this.head = null;
	}
	
	//This is the node
		class Node{
			
			int data;
			Node next;
			
			Node(int d){
				this.data = d;
				this.next = null;
		}
	}
	
	//Let's push an element
	public void push(int data) {
		
			Node N = new Node(data);
			N.next = head;
			head = N;
	}
	
	// and then pop it
	public int pop() {
		if(head == null) {
			System.out.println("Empty stack.");
			return -1;
		}
		
		int poppeData = head.data;
		head = head.next;
		return poppeData;
	}
	
	// Let's look for the top stack
	public int peek() {
		if(head == null) {
			System.out.println("Empty stack.");
			return -1;		// Indicates that the stack is empty.
		}
		return head.data;
	}
	
	// In stack, we must check if it is empty, always!!
	public boolean isEmpty() {
		return head == null;
	}
	
	// And finally, we print the stack
	public void printStack() {
		
		Node current = head;
		
		while(current != null) {
			System.out.println(current.data + " -> ");
			current = current.next;
		}
		System.out.println("null");
	}
	
	// Main method
	public static void main(String[] args) {
		StacksUsingLinkedLists S = new StacksUsingLinkedLists();
		
		S.push(0);
		S.push(1);
		S.push(3);
		
		System.out.println("Original Stack: ");
		S.printStack();
		
		System.out.println("Top element: " + S.peek());
		System.out.println("Stack Empty: " + S.isEmpty());
		
		S.pop();
		S.pop();
		S.pop();
		
		System.out.println("Modde stack: ");
		S.printStack();
		
		System.out.println("Stack Empty: " + S.isEmpty());
	}
}
