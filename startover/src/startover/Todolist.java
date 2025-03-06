package startover;
import java.util.ArrayList;
import java.util.Scanner;

public class Todolist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		public class TodoListApp {

		    public static void main(String[] args) {
		        ArrayList<String> tasks = new ArrayList<>();
		        ArrayList<Boolean> completed = new ArrayList<>();
		        Scanner scanner = new Scanner(System.in);

		        while (true) {
		            System.out.println("\n--- To-Do List App ---");
		            System.out.println("1. Add Task");
		            System.out.println("2. View Tasks");
		            System.out.println("3. Mark Task as Completed");
		            System.out.println("4. Delete Task");
		            System.out.println("5. Exit");
		            System.out.print("Choose an option: ");
		            int choice = scanner.nextInt();
		            scanner.nextLine(); // Consume newline

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter the task: ");
		                    String task = scanner.nextLine();
		                    tasks.add(task);
		                    completed.add(false); // Mark as not completed
		                    System.out.println("Task added!");
		                    break;

		                case 2:
		                    if (tasks.isEmpty()) {
		                        System.out.println("No tasks available.");
		                    } else {
		                        System.out.println("\n--- Your Tasks ---");
		                        for (int i = 0; i < tasks.size(); i++) {
		                            String status = completed.get(i) ? "[Completed]" : "[Pending]";
		                            System.out.println((i + 1) + ". " + tasks.get(i) + " " + status);
		                        }
		                    }
		                    break;

		                case 3:
		                    if (tasks.isEmpty()) {
		                        System.out.println("No tasks available.");
		                    } else {
		                        System.out.print("Enter the task number to mark as completed: ");
		                        int taskNumber = scanner.nextInt();
		                        if (taskNumber > 0 && taskNumber <= tasks.size()) {
		                            completed.set(taskNumber - 1, true);
		                            System.out.println("Task marked as completed!");
		                        } else {
		                            System.out.println("Invalid task number.");
		                        }
		                    }
		                    break;

		                case 4:
		                    if (tasks.isEmpty()) {
		                        System.out.println("No tasks available.");
		                    } else {
		                        System.out.print("Enter the task number to delete: ");
		                        int taskNumber = scanner.nextInt();
		                        if (taskNumber > 0 && taskNumber <= tasks.size()) {
		                            tasks.remove(taskNumber - 1);
		                            completed.remove(taskNumber - 1);
		                            System.out.println("Task deleted!");
		                        } else {
		                            System.out.println("Invalid task number.");
		                        }
		                    }
		                    break;

		                case 5:
		                    System.out.println("Exiting the app. Goodbye!");
		                    scanner.close();
		                    return;

		                default:
		                    System.out.println("Invalid option. Please try again.");
		            }
		        }
		    }
		}
	}

}
