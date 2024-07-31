//Package Declared
package todolist;

public class ToDoList {
	// Instance variables to hold up to three tasks
	private Task task1;
	private Task task2;
	private Task task3;

	//Adds a task to the to-do list.
	public void addTask(String description, int taskNumber) {
		switch(taskNumber) {
		case 1: 
			// Adds the task to the first position
			task1 = new Task(description);
			break;
		case 2:
			//Adds the task to the sencond position
			task2 = new Task(description);
			break;
		case 3:
			// Adds the task to the third position
			task3 = new Task(description);
			break;
		default:
			// Prints an error message if an invalid position is specified
			System.out.println("Invalid task number.");

		}
	}

	//Removes a task from the to-do list.
	public void removeTask(int taskNumber) {
		switch(taskNumber) {
		case 1:
			// Removes the task from the first position
			task1 = null;
			break;
		case 2:
			// Removes the task from the second position
			task2 = null;
			break;
		case 3:
			// Removes the task from the third position
			task3 = null;
			break;
		default:
			// Prints an error message if an invalid position is specified
			System.out.println("Invalid task number.");
		}
	}

	//Mark the task as done.
	public void markTaskAsDone(int taskNumber) {
		switch(taskNumber) {
		case 1:
			// Marks the task in the first position as done if it exists
			if (task1 != null) task1.markAsDone();
			else System.out.println("Task 1 is empty.");
			break;
		case 2:
			// Marks the task in the second position as done if it exists
			if (task2 != null) task2.markAsDone();
			else System.out.println("Task 2 is empty.");
			break;
		case 3:
			// Marks the task in the third position as done if it exists
			if (task3 != null) task3.markAsDone();
			else System.out.println("Task 3 is empty.");
			break;
		default:
			// Prints an error message if an invalid position is specified
			System.out.println("Invalid task number.");
		}
	}

	//Display the tasks in the to do list.
	public void displayTasks() {
		System.out.println("To-Do List:");
		// Displays the first task if it exists, otherwise indicates it's empty
		if (task1 != null) System.out.println("1. " + task1);
		else System.out.println("1. [ ] Empty");

		// Displays the second task if it exists, otherwise indicates it's empty
		if (task2 != null) System.out.println("2. " + task2);
		else System.out.println("2. [ ] Empty");

		// Displays the third task if it exists, otherwise indicates it's empty
		if (task3 != null) System.out.println("3. " + task3);
		else System.out.println("3. [ ] Empty");
	}



}
