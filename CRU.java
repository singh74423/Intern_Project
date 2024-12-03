import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTask Manager");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addTask(tasks, scanner);
                    break;
                case 2:
                    viewTasks(tasks);
                    break;
                case 3:
                    updateTask(tasks, scanner);
                    break;
                case 4:
                    deleteTask(tasks, scanner);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addTask(ArrayList<String> tasks, Scanner scanner) {
        System.out.print("Enter task: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    private static void viewTasks(ArrayList<String> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    private static void updateTask(ArrayList<String> tasks, Scanner scanner) {
        viewTasks(tasks);
        System.out.print("Enter the index of the task to update: ");
        int index = scanner.nextInt() - 1;

        if (index >= 0 && index < tasks.size()) {
            System.out.print("Enter the new task: ");
            String newTask = scanner.nextLine();
            tasks.set(index, newTask);
            System.out.println("Task updated successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    private static void deleteTask(ArrayList<String> tasks, Scanner scanner) {
        viewTasks(tasks);
        System.out.print("Enter the index of the task to delete: ");
        int index = scanner.nextInt() - 1;

        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }
}