//Package Declared
package todolist;

//import scanner class
import java.util.Scanner;

//Main class
public class ToDoListAppication {
	// Creating a single instance of ToDoList to manage tasks
	private static ToDoList toDoList = new ToDoList();
	// Creating a Scanner object to read user input
	private static Scanner scanner = new Scanner(System.in);

	//Main method
	public static void main(String[] args) {
		boolean exit = false;

		while (!exit) {
			// Display the menu options to the user
			showMenu();
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			// Perform actions based on user's choice
			switch (choice) {
			case 1:
				// Call addTask method to add a new task
				addTask();
				break;
			case 2:
				// Call removeTask method to remove an existing task
				removeTask();
				break;
			case 3:
				// Call markTaskAsDone method to mark a task as done
				markTaskAsDone();
				break;
			case 4:
				// Display all tasks
				toDoList.displayTasks();
				break;
			case 5:
				// Exit the loop and application
				exit = true;
				break;
			default:
				// Print an error message for invalid choices
				System.out.println("Invalid choice. Please try again.");
			}
		}
		System.out.println("Exiting To-Do List application.");
	}

	//Display menu options
	private static void showMenu() {
		System.out.println("\nTo-Do List Menu:");
		System.out.println("1. Add Task");
		System.out.println("2. Remove Task");
		System.out.println("3. Mark Task as Done");
		System.out.println("4. Display Tasks");
		System.out.println("5. Exit");
	}

	//Prompts the user to enter task details and adds the task to the to-do list.
	private static void addTask() {
		System.out.print("Enter the task description: ");
		String description = scanner.nextLine();
		System.out.print("Enter task number (1-3): ");
		int taskNumber = scanner.nextInt();
		scanner.nextLine(); // Consume newline
		toDoList.addTask(description, taskNumber);
		System.out.println("Task added.");
	}

	
	//Prompts the user to enter a task number and removes the corresponding task from the to-do list.
	private static void removeTask() {
		System.out.print("Enter task number to remove (1-3): ");
		int taskNumber = scanner.nextInt();
		scanner.nextLine(); // Consume newline
		toDoList.removeTask(taskNumber);
	}

	//Prompts the user to enter a task number and marks the corresponding task as done.
	private static void markTaskAsDone() {
		System.out.print("Enter task number to mark as done (1-3): ");
		int taskNumber = scanner.nextInt();
		scanner.nextLine(); // Consume newline
		toDoList.markTaskAsDone(taskNumber);
	}
}
