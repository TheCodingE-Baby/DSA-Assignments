public class Node {
	public Task task;
	public Node next;
	
	public Node(Task task) {
		this.task = task;
		this.next = null;
	}
	
    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}

