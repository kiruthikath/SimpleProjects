//Package Declared
package todolist;

public class Task {
	//Declaring Instance Variable
	private String description; // Holds the description of a task
	private boolean isDone; //Indicates if thee task is completed or not
	
	//Constructor to initialize the task with a description
	public Task(String description) {
		this.description = description; //Sets the task description
		this.isDone = false; //Initializes the task is not done.
	}
	
	public String getDescription() {
		return description;  //Returns the task description
		
	}
	
	public boolean isDone() {
		return isDone;    // Returns the status of the task done
	}
	
	public void markAsDone() {
		this.isDone = true;  //Initializes the task is done
	}
	
	public String toString() {
		 // Returns a string with [X] if the task is done, otherwise [ ]
		return (isDone? "[X]" : "[] ") + description;
	}
	

}
