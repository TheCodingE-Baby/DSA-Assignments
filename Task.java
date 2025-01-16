public class Task {
	private  String title;
	private String description; 
	private boolean completed;
	
	public Task(String title, String desc) {
		this.title = title;
		this.description = desc;
		this.completed = false;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDescription() {
		return description;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void removeTask(){
		if (title == null){
			System.out.println("Invalid Task.");
		}
		else{
			title = null;
			description = null;
			completed = false;
		}
	}
	

	
	public void markCompleted() {
		completed = true;
	}
	
        @Override
	public String toString() {
		return "Title: " + title + "\nDescription: " + description + "\nCompleted: " + completed;
		}
}
