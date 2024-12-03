import java.util.ArrayList;
import java.util.Scanner;

public class CRUD {
    // List to store tasks
    private static ArrayList<String> tasks = new ArrayList<>();

    // Scanner for reading user input
    private static Scanner scanner = new Scanner(System.in);

    // Method to display the menu
    public static void showMenu() {
        System.out.println("\n------ Task Manager ------");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Update Task");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit");
    }

    // Method to add a new task
    public static void addTask() {
        System.out.print("Enter the task description: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    // Method to view all tasks
    public static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
        } else {
            System.out.println("\n--- List of Tasks ---");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    // Method to update an existing task
    public static void updateTask() {
        viewTasks();
        System.out.print("Enter the task number to update: ");
        int taskNum = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after the integer input

        if (taskNum >= 1 && taskNum <= tasks.size()) {
            System.out.print("Enter the new task description: ");
            String newTask = scanner.nextLine();
            tasks.set(taskNum - 1, newTask);
            System.out.println("Task updated successfully.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    // Method to delete a task
    public static void deleteTask() {
        viewTasks();
        System.out.print("Enter the task number to delete: ");
        int taskNum = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (taskNum >= 1 && taskNum <= tasks.size()) {
            String deletedTask = tasks.remove(taskNum - 1);
            System.out.println("Task '" + deletedTask + "' deleted successfully.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        while (true) {
            showMenu();
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addTask();
                    break;
                case "2":
                    viewTasks();
                    break;
                case "3":
                    updateTask();
                    break;
                case "4":
                    deleteTask();
                    break;
                case "5":
                    System.out.println("Exiting the Task Manager. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
