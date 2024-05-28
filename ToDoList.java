package com.codesforDSA.www;

public class ToDoList {
	
	private Node head;

	public ToDoList() {
			head = null;
		}
		
		public void addToDo(Task task) {
			Node N = new Node(task);
			
			if(head == null) {
				head = N;
			} else {
				Node curr = head;
				
				while(curr.next != null) {
					curr = curr.next;
				}
				curr.next = N;
			}
		}
		
		public void markToDoAsCompleted(String title) {
			Node curr = head;
			while(curr != null) {
				if(curr.task.getTitle().equals(title)) {
					curr.task.markCompleted();
					return;
				}
				curr = curr.next;
			}
			System.out.println("Task not found.");
		}
		
		public void viewToDoList() {
			Node curr = head;
			System.out.println("Task list: ");
			
			while(curr != null) {
				System.out.println(curr.task);
				curr = curr.next;
			}
		}
		public static void main (String[] args) {
			ToDoList TdL = new ToDoList();
			
			TdL.addToDo(new Task("Start Coding.", "You like to code, don't you?"));
			TdL.addToDo(new Task("Eat noodles.", "After making the noodles, dig in!"));
			TdL.addToDo(new Task("Mow the lawn.", "The grass needs to be shorter than it was."));
			TdL.addToDo(new Task("Take a nap.", "You need to rest, your eyes look lkie they have more bags than you."));
			
			TdL.markToDoAsCompleted("Mow the lawn.");
			TdL.markToDoAsCompleted("Take a nap.");
			TdL.viewToDoList();
		}
	}
