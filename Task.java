package com.codesforDSA.www;

public class Task {
	private String title, desc; 
	private boolean completed;
	
	public Task(String title, String desc) {
		this.title = title;
		this.desc = desc;
		this.completed = false;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDesc() {
		return desc;
	}

	public boolean isCompleted() {
		return completed;
	}
	
	public void markCompleted() {
		completed = true;
	}
	
	public String toString() {
		return "Title: " + title + "\nDescription: " + desc + "\nCompleted: " + completed;
	}
}
