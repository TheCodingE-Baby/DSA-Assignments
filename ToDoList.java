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
		}

			 void removeTask(String title) {
				if (title == null) return;

				Node temp = head, prev = null;

				// If head node itself holds the title to be deleted
				if (temp != null && (temp.task.getTitle().equals(title) || temp.task.getDescription().equals(title))) {
					head = temp.next; // Changed head
					return;
				}

				// Search for the title to be deleted, keep track of the previous node
				while (temp != null && !(temp.task.getTitle().equals(title) || temp.task.getDescription().equals(title))) {
					prev = temp;
					temp = temp.next;
				}

				// If title was not present in linked list
				if (temp == null) return;

				// Unlink the node from linked list
				if (prev != null) {
					prev.next = temp.next;
				}
			

	    	// Remove the node
	    	Node next = temp.next.next;

	    	temp.next = next;
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
			
			//Adding tasks
			TdL.addToDo(new Task("Start Coding.", "You like to code, don't you?"));
			TdL.addToDo(new Task("Eat noodles.", "After making the noodles, dig in!"));
			TdL.addToDo(new Task("Go to the gym.", "You need to get those gains!"));
			TdL.addToDo(new Task("Mow the lawn.", "The grass needs to be shorter than it was."));
			TdL.addToDo(new Task("Take a nap.", "You need to rest, your eyes look lkie they have more bags than you."));
			TdL.addToDo(new Task("Take wife out to dinner.", "Tomorrow is marriage anniversary."));
			TdL.addToDo(new Task("Go to the store.", "You need to buy some groceries."));
			TdL.addToDo(new Task("Buy suits for Grad with the boys.", "Gotta look fly for the big day."));

			// Removing tasks
			TdL.removeTask("Eat noodles.");
			TdL.removeTask("Take a nap.");
			TdL.removeTask("Mow the lawn.");


			// Marking tasks as completed
			TdL.markToDoAsCompleted("Mow the lawn.");
			TdL.markToDoAsCompleted("Take a nap.");
			TdL.markToDoAsCompleted("Start Coding.");
			TdL.markToDoAsCompleted("Take wife out to dinner.");
			TdL.markToDoAsCompleted("Go to the store.");
			TdL.markToDoAsCompleted("Buy suits for Grad with the boys.");
			TdL.markToDoAsCompleted("Go to the gym.");

			// Viewing the list
			TdL.viewToDoList();
		}
	}
